package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployeeService;
import kodlamaio.hrms.core.utilities.adapters.validation.abstracts.CustomerCheckService;
import kodlamaio.hrms.core.utilities.adapters.validation.abstracts.EmailSendService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployeeDao;
import kodlamaio.hrms.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService {

    EmployeeDao employeeDao;
    CustomerCheckService employeeCheckService;
    EmailSendService emailSendService;
    
    @Autowired
	public EmployeeManager(EmployeeDao employeeDao,CustomerCheckService employeeCheckService,EmailSendService emailSendService) {
		this.employeeDao = employeeDao;
		this.employeeCheckService = employeeCheckService;
		this.emailSendService = emailSendService;
	}
	
	@Override
	public DataResult<List<Employee>> getAll() {
		var data = this.employeeDao.findAll();
		return new SuccessDataResult<List<Employee>>(data);
	}
	@Override
	public Result add(Employee employee) {
		if(checkEmail(employee.getEmail()) && checkIsRealPerson(employee) ) {
			this.employeeDao.save(employee);
			this.emailSendService.send(employee.getEmail());
			return new SuccessResult("Kayıtınız Başarıyla gerçekleşti");
		}
		return new ErrorResult();
		
	}
	
	public boolean checkEmail(String email){
		if(this.employeeDao.getByEmail(email) != null) {
			return false;
		}
		return true;
	}
	public boolean checkIsRealPerson(Employee employee) {

		return this.employeeCheckService.checkforperson(employee);
	}
	
	
}
