package view;

import org.newdawn.slick.*;
import beatTheHeart.Balloon;
import beatTheHeart.Goodie;
import beatTheHeart.GoodieTypes;
import beatTheHeart.Stuff;

public class GoodieSprite extends BeatTheHeartSprite {
	
	private Goodie goodie;

	public GoodieSprite(Goodie g) {
		super(g);
		goodie = g;
	}
	
	public void init() throws SlickException {
		super.init();
		
		if (goodie.getType() == GoodieTypes.tenPoints){
			img = new Image("pics/heart_red.png");
		}
		else if (goodie.getType() == GoodieTypes.fivePoints){
			img = new Image("pics/heart_yellow.png");
		}
		else if (goodie.getType() == GoodieTypes.freeze){
			img = new Image("pics/heart_frozen.png");
		}
		
	}

}
