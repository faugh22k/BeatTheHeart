package beatTheHeart;

import java.awt.geom.Point2D;


public abstract class Stuff {

	protected Point2D.Double position;
	protected int speed;
	protected int id;
	
	public Stuff( int speed, Point2D.Double position, int id){
		
		this.position = position;
		this.speed = speed;
		this.id = id;

	}

	public Point2D.Double getPosition() {
		return position;
	}

	public void setPosition(Point2D.Double position) {
		this.position = position;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	} 
	
	public abstract void move();

}
