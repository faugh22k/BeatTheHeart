package view;

import org.newdawn.slick.*;
import beatTheHeart.Balloon;
import beatTheHeart.Goodie;
import beatTheHeart.Stuff;

public class BalloonSprite extends BeatTheHeartSprite {
	
	//private Balloon balloon;

	public BalloonSprite(Balloon b) {
		super(b);
		//balloon = b;
	}

	public void init() throws SlickException {
		super.init();
		//img = new Image("pics/heart_balloon_shineString_overlay.png");
		img = new Image("pics/heart_yellow.png");
	}

}