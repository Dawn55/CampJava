package oopIntro.GameShop.Abstract;

import oopIntro.GameShop.Entities.Campaign;

public interface CampaignService {

	void add(Campaign camp);
	void delete(Campaign camp);
	void update(Campaign camp);
	Campaign campIsExsist();
}
