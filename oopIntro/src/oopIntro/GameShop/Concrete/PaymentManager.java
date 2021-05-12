package oopIntro.GameShop.Concrete;

import oopIntro.GameShop.Abstract.CampaignService;
import oopIntro.GameShop.Abstract.PaymentService;
import oopIntro.GameShop.Entities.User;

public class PaymentManager implements PaymentService {

	CampaignService campService;
	public PaymentManager(CampaignService campService) {
		this.campService = campService;
	}
	@Override
	public void pay(User user) {
	double discount =	this.campService.campIsExsist().getDiscount();
	 
		System.out.println("indirim uygulanýp ödeme yapýldý");
		
	}

}
