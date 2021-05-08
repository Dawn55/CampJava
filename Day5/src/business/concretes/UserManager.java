package business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstracts.UserService;
import core.utilities.VerificationLinkSender;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {
	UserDao userDao;
	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		if(checkemailexsist(user.getEmail()) && checkMinLengthNames(user) && checkEmailIsValid(user.getEmail()) ) {
			userDao.add(user);
		}
		VerificationLinkSender.send(user);
		
		if(true) {
			//linke týklanýrsa
			user.setStatus(true);
		}
		user.setStatus(false);
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getbyid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean checkemailexsist(String email) {
	var result = userDao.getByEmail(email);
	if(result != null) {
		return false;
	}
	 return true;
	}
	public boolean checkMinLengthNames(User user) {
		if(user.getFirstName().length()>= 2 && user.getLastName().length() >=2) {
			return true;
		}
		return false;
	}
	public boolean checkEmailIsValid(String email) {
		Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
		Matcher matcher = pattern.matcher(email);
		 var result = matcher.matches();
		 if(result) {
			 return true;
		 }
		 return false;
	}
	

}
