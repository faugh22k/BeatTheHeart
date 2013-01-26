
import org.newdawn.slick.*;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;


public class ClubSprite extends BeatTheHeartSprite implements MouseListener {
	
	private Shape collisionShape;
	
	public ClubSprite() {
		
		collisionShape = new Rectangle(512,384,168,389);
		
	}
	@Override
	public boolean isAcceptingInput() {
		return true;
	}
	
	public void init() throws SlickException {
		img = new Image("pics/club.png");
		img.rotate(-20);

	}

	public void render(GameContainer gc,  Graphics g) throws SlickException {
		
		g.drawImage(img, collisionShape.getX(), collisionShape.getY());
	}
	
	@Override
	public void mouseMoved(int arg0, int y, int x, int arg3) {
		collisionShape.setX(x-100);
		collisionShape.setY(y-30);
	}

	public int getID() {
		return 0;
	}

	@Override
	public void mouseClicked(int arg0, int x, int y, int arg3) {
		
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
