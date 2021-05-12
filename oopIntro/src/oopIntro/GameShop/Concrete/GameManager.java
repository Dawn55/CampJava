package oopIntro.GameShop.Concrete;

import oopIntro.GameShop.Abstract.GameService;

public class GameManager implements GameService{

	@Override
	public void add() {
		System.out.println("oyun eklendi");
		
	}

	@Override
	public void delete() {
		System.out.println("oyun silindi");
		
	}

	@Override
	public void update() {
		System.out.println("oyun güncellendi");
		
	}

}
