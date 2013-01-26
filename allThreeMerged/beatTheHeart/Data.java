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

	public Balloon addBalloon(int speed, Point2D.Double position, int balloonID, int amplitude){
		Balloon toAdd = new Balloon(speed, position, balloonID);
		toAdd.setAmplitude(amplitude);
		System.out.println("adding balloon");
		objects.add(toAdd);
		
		return toAdd;
	}
	
	public Goodie addGoodie(int speed, Point2D.Double position, int balloonID){
		Goodie toAdd = new Goodie(speed, position, balloonID);
		System.out.println("adding goodie");
		objects.add(toAdd);
		
		return toAdd;
	}
	
	public void update(){
		//System.out.println("*** in update.");
		int y;
		for(int i = 0; i < objects.size(); i++){
			//System.out.println("moving objects");
			y = objects.get(i).move();
			if(y < 0 && !objects.get(i).gone && objects.get(i).getClass() == Balloon.class){
				System.out.println("                                       score = " + score);
				Balloon b = (Balloon) objects.get(i);
				int deduction = (b.getLimit() - b.getNumberOfClicks()) * 4;
				score -= deduction;
				b.gone = true;
				System.out.println("                                       new score = " + score);
			}
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
