package beatTheHeart;

import java.awt.geom.Point2D;
import java.util.ArrayList;

public class Data {
	
	private int score;
	private ArrayList<Stuff> objects;
	
	public Data(){
		score = 0;
		objects = new ArrayList<Stuff>(40);
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public ArrayList<Stuff> getStuff() {
		return objects;
	}

	public void addBalloon(int speed, Point2D.Double position, int balloonID){
		Balloon toAdd = new Balloon(speed, position, balloonID);
		System.out.println("adding balloon");
		objects.add(toAdd);
	}
	
	public void addGoodie(int speed, Point2D.Double position, int balloonID){
		Goodie toAdd = new Goodie(speed, position, balloonID);
		System.out.println("adding goodie");
		objects.add(toAdd);
	}
	
	public void update(){
		System.out.println("in update.");
		for(int i = 0; i < objects.size(); i++){
			System.out.println("moving objects");
			objects.get(i).move();
		}
	}
	
	public Stuff getItem(int index){
		return objects.get(index);
	}
	
	public void changeMotion(boolean isRising){
		for(int i = 0; i < objects.size(); i++){
			if(objects.get(i).getClass().equals(Balloon.class)){
				((Balloon) objects.get(i)).setRising(isRising);
			}
		}
	}
	
	
	/*public void setGoodies(ArrayList<Goodie> goodies) {
		this.goodies = goodies;
	}
	public void setBalloons(ArrayList<Balloon> balloons) {
		this.balloons = balloons;
	}*/
	
}
