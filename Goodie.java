package beatTheHeart;

import java.awt.geom.Point2D;

public class Goodie {
	
	private Point2D position;
	private int speed;
	private GoodieTypes type;
	
	public Goodie(int x, int y){
		position.setLocation(x, y);
		speed = 5;
		
		double tmp = Math.random();
		GoodieTypes[] values = type.values();
		tmp = tmp * values.length;
		type = values[(int) tmp];
		
	}

	public void move(){
		position.setLocation(position.getX(), position.getY() + speed);
	}
	
	public Point2D getPosition() {
		return position;
	}

	public void setPosition(Point2D position) {
		this.position = position;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public GoodieTypes getType() {
		return type;
	}

	public void setType(GoodieTypes type) {
		this.type = type;
	}
}
