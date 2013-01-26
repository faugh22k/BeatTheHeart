package beatTheHeart;

import java.awt.geom.Point2D;


public class Balloon {
	
	private BalloonColors color;
	
	private Point2D balloonPosition;
	
	private double balloonSpeed;
	
	private int numberOfClicks;
	
	private boolean rising;
	
	public Balloon(double speed, double positionX, double positionY ){
		
		balloonSpeed = speed;
		balloonPosition.setLocation( positionX, positionY);
		rising = true;
	}


	public boolean isRising() {
		return rising;
	}


	public void setRising(boolean rising) {
		this.rising = rising;
	}


	public Point2D getBalloonPosition() {
		return balloonPosition;
	}


	public void setBalloonPosition(Point2D balloonPosition) {
		this.balloonPosition = balloonPosition;
	}


	public double getBalloonSpeed() {
		return balloonSpeed;
	}


	public void setBalloonSpeed(double balloonSpeed) {
		this.balloonSpeed = balloonSpeed;
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
		
		double x = balloonPosition.getX();
		double y = balloonPosition.getY();
		
		x = amplitude * Math.sin(frequency * y);
		
		if( rising ){
			y = y - balloonSpeed;
		}
		
		balloonPosition.setLocation(x,y); 
	} 
}

