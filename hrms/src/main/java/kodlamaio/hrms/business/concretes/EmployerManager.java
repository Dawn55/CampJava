package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.utilities.adapters.validation.abstracts.EmailSendService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {

	EmailSendService emailSendService;
	EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao,EmailSendService emailSendService) {
		this.employerDao =employerDao;
		this.emailSendService = emailSendService;
	}
	
	@Override
	public DataResult<List<Employer>> getAll() {
		var data = this.employerDao.findAll();
		return new SuccessDataResult<List<Employer>>(data);
	}
	@Override
	public Result add(Employer employer){
		if(checkEmail(employer.getEmail())) {
			this.employerDao.save(employer);
			this.emailSendService.send(employer.getEmail());
			return new SuccessResult();
		}
		return new ErrorResult();
		
	}
	
	
	public boolean checkEmail(String email){
		if(this.employerDao.getByEmail(email) != null) {
			return false;
		}
		return true;
	}

}
