package beatTheHeart;

import java.awt.geom.Point2D;


public class Balloon extends Stuff{
	
	private BalloonColors color;
	
	private int numberOfClicks;
	
	private boolean rising;
	
	public Balloon( int speed, Point2D position, int balloonID ){
		super( speed, position, balloonID );
		
		rising = true;
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


	public void setBalloonPosition(Point2D balloonPosition) {
		position = balloonPosition;
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
	
	public void move(int amplitude, int frequency){
		
		double x = position.getX();
		double y = position.getY();
		
		x = amplitude * Math.sin(frequency * y);
		
		if( rising ){
			y = y - speed;
		}
		
		position.setLocation(x,y);
		
	
		
		
	}
	
	
	
	
	

	

}