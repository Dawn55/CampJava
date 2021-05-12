package oopIntro.GameShop.Concrete;

import oopIntro.GameShop.Abstract.CampaignService;
import oopIntro.GameShop.Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign camp) {
		System.out.println("kampaya eklendi");
		
	}

	@Override
	public void delete(Campaign camp) {
		System.out.println("kampanya silindi");
		
	}

	@Override
	public void update(Campaign camp) {
		System.out.println("kampanya g�ncellendi");
		
	}

	@Override
	public Campaign campIsExsist() {
		
		System.out.println("kampanya olup olmad��� kontrol et var olan kampanyay� yolla");
		return new Campaign();
	}

}
