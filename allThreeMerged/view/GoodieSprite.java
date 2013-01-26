package view;

import org.newdawn.slick.*;
import beatTheHeart.Balloon;
import beatTheHeart.Goodie;
import beatTheHeart.GoodieTypes;
import beatTheHeart.Stuff;

import org.newdawn.slick.*;
import org.newdawn.slick.geom.Rectangle;

public class GoodieSprite extends BeatTheHeartSprite implements MouseListener{

	private Goodie goodie;
	
	public GoodieSprite(Goodie g) {
		super(g);
		goodie = g;
	}
	public void init() throws SlickException {
		super.init();
		shape=new Rectangle((int) position.x, (int) position.y, 300, 400);
		
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
	@Override
	public void mouseClicked(int arg0, int x, int y, int arg3) {
		if(shape.contains(x,y))
			exists=true;
		
	}

}


/*
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
*/