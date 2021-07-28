package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {

	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		
		this.jobPositionDao = jobPositionDao;
	}
	
	
	@Override
	public DataResult<List<JobPosition>> getall() {
		var data = this.jobPositionDao.findAll();
		return new SuccessDataResult<List<JobPosition>>(data);
	}
	@Override
	public Result add(JobPosition jobPosition) {
		if(checkIsPositionExist(jobPosition.getId())) {
			this.jobPositionDao.save(jobPosition);
			return new SuccessResult();
		}
		return new ErrorResult();
				
	}
	
	public boolean checkIsPositionExist(int id){
		if(this.jobPositionDao.getById(id) != null) {
		 return false;
		}
		return true;
	}

}
