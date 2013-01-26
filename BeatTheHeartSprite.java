package view;

import java.awt.geom.Point2D;
import org.newdawn.slick.*;
import beatTheHeart.Balloon;
import beatTheHeart.Goodie;
import beatTheHeart.Stuff;


public class BeatTheHeartSprite {
	protected Image img;
	protected Point2D.Double position;
	private Stuff stuff;

	public BeatTheHeartSprite(Stuff s) {
		stuff = s;
	}

	public void init() throws SlickException {
		position = new Point2D.Double();
		position.setLocation(stuff.getPosition());
	}

	public void update() throws SlickException {
		position.setLocation(stuff.getPosition());
	}

	public void render(Graphics g) throws SlickException {
		
		g.drawImage(img, (float) position.getX(), (float) position.getY());
	}

}
