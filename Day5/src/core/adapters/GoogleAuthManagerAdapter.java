package core.adapters;

import business.abstracts.AuthService;
import entities.concretes.User;

public class GoogleAuthManagerAdapter implements AuthService {

	@Override
	public boolean login(User user) {
		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
	return	googleAuthManager.login(user);

	}

	@Override
	public void register(User user) {
		GoogleAuthManager googleAuthManager = new GoogleAuthManager();
		googleAuthManager.register(user);
	}

}
