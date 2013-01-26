package beatTheHeart;

import java.awt.geom.Point2D;


public class Balloon extends Stuff{
	
	private BalloonColors color;
	
	private int numberOfClicks;
	
	private boolean rising;
	
	private int amplitude;
	private int frequency;
	private int LIMIT;
	
	
	public Balloon(int speed, Point2D.Double position, int balloonID){
		super( speed, position, balloonID );
		
		rising = true;
		
		amplitude = 3;
		frequency = 2;
		
		LIMIT = 5;
	}


	public boolean isRising() {
		return rising;
	}


	public void setRising(boolean rising) {
		this.rising = rising;
	}


	public Point2D getBalloonPosition() {
		return super.getPosition();
		
	}


	public void setBalloonPosition(Point2D.Double balloonPosition) {
		position = balloonPosition;
	}

	public int getLimit(){
		return LIMIT;
	}

	public double getBalloonSpeed() {
		return super.getSpeed();
	}


	public void setBalloonSpeed(int balloonSpeed) {
		speed = balloonSpeed;
	}

	public int getID(){
		return super.getID();
		}

	public BalloonColors getColor() {
		return color;
	}


	public void setColor(BalloonColors color) {
		this.color = color;
	}


	public int getNumberOfClicks() {
		return numberOfClicks;
	}


	public void setNumberOfClicks(int numberOfClicks) {
		this.numberOfClicks = numberOfClicks;
	}
	
	@Override
	public void move(){
		
		double x = position.getX();
		double y = position.getY();
		
		x = amplitude * Math.sin(frequency * y);
		
		if( rising ){
			y = y - speed;
		}
		
		System.out.println("balloon. id = " + id + ", x = " + x + ", y = " + y);
		position.setLocation(x,y); 
	} 
}