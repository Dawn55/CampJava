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
		System.out.println("kampanya güncellendi");
		
	}

	@Override
	public Campaign campIsExsist() {
		
		System.out.println("kampanya olup olmadýðý kontrol et var olan kampanyayý yolla");
		return new Campaign();
	}

}
