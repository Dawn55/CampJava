package business.concretes;

import business.abstracts.AuthService;
import business.abstracts.UserService;
import entities.concretes.User;

public class AuthManager implements AuthService {
	UserService userService;

	@Override
	public boolean login(User user) {
	 var result = userService.getbyid(user.getId());
      if(result != null) {
    	  return true;
      }
      return false;
	}

	@Override
	public void register(User user) {
		 var result = userService.getbyid(user.getId());
	      if(result != null) {
	    	  return;
	      }
	      userService.add(user);
		
	}

}
