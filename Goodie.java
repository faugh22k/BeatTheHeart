package beatTheHeart;

import java.awt.geom.Point2D;

public class Goodie extends Stuff{
	
	private GoodieTypes type;
	
	public Goodie(int speed, Point2D.Double position, int id){
		super( speed, position, id );
		
		double tmp = Math.random();
		GoodieTypes[] values = type.values();
		tmp = tmp * values.length;
		type = values[(int) tmp];
		
	}

	public void move(){
		position.setLocation(position.getX(), position.getY() + speed);
		
		System.out.println("googie id = " + id + ", x = " + position.getX() + ", y = " + position.getY());
	}
	
	public Point2D.Double getPosition() {
		return super.getPosition();
	}

	public void setPosition(Point2D.Double GoodiePosition) {
		position = GoodiePosition;
	}

	public int getSpeed() {
		return super.getSpeed();
	}

	public void setSpeed(int GoodieSpeed) {
		speed = GoodieSpeed;
	}

	public GoodieTypes getType() {
		return type;
	}

	public void setType(GoodieTypes type) {
		this.type = type;
	}
}
