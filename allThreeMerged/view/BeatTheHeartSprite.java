package view;

import java.awt.geom.Point2D;
import org.newdawn.slick.*;
import org.newdawn.slick.geom.Shape;

import beatTheHeart.Stuff;

public class BeatTheHeartSprite implements MouseListener {
	
	public Image img;
	public boolean exists;
	public Shape shape;
	public Point2D.Double position;
	float randomX = (float) Math.random() * 1024, randomY = (float) Math.random() * 768;
	private Stuff stuff;

	public BeatTheHeartSprite(Stuff s) {
		stuff = s;
	}
	public boolean isAcceptingInput()
	{
		return true;
	}

	public void init() throws SlickException {
		
		position = new Point2D.Double();
		position.setLocation(stuff.getPosition());
		
		exists=true;
	}

	public void update() throws SlickException {
		position.setLocation(stuff.getPosition());
		shape.setLocation((float) position.x, (float) position.y);
	}

	public void render(/*GameContainer gc,*/Graphics g) throws SlickException {
		if(exists) {
			g.drawImage(img, (float)position.getX(), (float)position.getY());
		}
	}
	
	@Override
	public void mouseClicked(int arg0, int x, int y, int arg3) {
		System.out.println("                                            mouse clicked.");
		if(shape.contains(x,y)) {
			exists=false;
		}
		
	}
	public int getID() {
		return 0;
	}

	@Override
	public void inputEnded() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inputStarted() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setInput(Input arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(int arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(int arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseWheelMoved(int arg0) {
		// TODO Auto-generated method stub
		
	}

}

/*package view;

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
*/
