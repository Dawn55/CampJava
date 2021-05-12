package oopIntro.GameShop.Concrete;

import oopIntro.User;
import oopIntro.GameShop.Abstract.IValidationService;

public class MernisValidationManager implements IValidationService {

	@Override
	public void valid(User user) {
		System.out.println("E-Devlet ile doðrulama yapýldý");
		
	}

}
