package view;

import org.newdawn.slick.*;
import org.newdawn.slick.geom.Rectangle; 
import beatTheHeart.Balloon;
import beatTheHeart.Goodie;
import beatTheHeart.Stuff;

public class BalloonSprite extends BeatTheHeartSprite implements MouseListener {

	public BalloonSprite(Balloon b) {
		super(b);
	}

	public void init() throws SlickException {
		super.init();
		shape=new Rectangle((int) position.x, (int) position.y,300, 400);
		img = new Image("pics/heart_balloon_shineString_overlay.png");
	}
	
	@Override
	public void mouseClicked(int arg0, int x, int y, int arg3) {
		System.out.println("                                            mouse clicked.");
		if(shape.contains(x,y)){
			exists=false;
		}
		
	}
}
/*package view;

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

}*/