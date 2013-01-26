package view;
import java.util.ArrayList;
import org.newdawn.slick.*;

import beatTheHeart.Balloon;
import beatTheHeart.Goodie;


public class View{

	private ArrayList<BeatTheHeartSprite> sprites;
	
	public void addBalloonSprite(Balloon b) throws SlickException{
		BalloonSprite balloon = new BalloonSprite(b);
		balloon.init();
		sprites.add(balloon);
	}
	
	public void addGoodieSprite(Goodie g) throws SlickException{
		GoodieSprite goodie = new GoodieSprite(g);
		goodie.init();
		sprites.add(goodie);
	}

	public View() {
		sprites = new ArrayList<BeatTheHeartSprite>(41);
	}

	public void update() throws SlickException {
		for (int i = 0; i < sprites.size(); i++) {
			sprites.get(i).update();
		}
	}
	
	public void render(Graphics g) throws SlickException {
		for (int i = 0; i < sprites.size(); i++) {
			sprites.get(i).render(g);
		}
	}

}
