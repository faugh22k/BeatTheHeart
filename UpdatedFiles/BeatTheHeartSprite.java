import java.awt.geom.Point2D;
import org.newdawn.slick.*;
import org.newdawn.slick.geom.Shape;

public class BeatTheHeartSprite implements MouseListener {
	
	public Image img;
	public boolean exists;
	public Shape shape;
	public Point2D.Double position;
	float randomX = (float) Math.random() * 1024, randomY = (float) Math.random() * 768;

	public BeatTheHeartSprite() {
		
	}
	public boolean isAcceptingInput()
	{
		return true;
	}

	public void init() throws SlickException {
		
		position = new Point2D.Double();
		position.setLocation(Math.random() * 1024,Math.random() * 768);
		
		exists=true;
	}

	public void update() throws SlickException {
		position.setLocation(position.getX(),position.getY()-0.1);
	}

	public void render(GameContainer gc,Graphics g) throws SlickException {
		if(exists)
			g.drawImage(img, (float)position.getX(), (float)position.getY());
		
	}
	
	@Override
	public void mouseClicked(int arg0, int x, int y, int arg3) {
		if(shape.contains(x,y))
			exists=false;
		
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