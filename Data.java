package beatTheHeart;

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


	
	
	
	/*public void setGoodies(ArrayList<Goodie> goodies) {
		this.goodies = goodies;
	}
	public void setBalloons(ArrayList<Balloon> balloons) {
		this.balloons = balloons;
	}*/
	
}
