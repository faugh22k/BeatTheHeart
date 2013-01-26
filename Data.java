package beatTheHeart;

import java.util.ArrayList;

public class Data {
	
	private int score;
	private ArrayList<Balloon> balloons;
	private ArrayList<Goodie> goodies;
	
	public Data(){
		score = 0;
		balloons = new ArrayList<Balloon>(20);
		goodies = new ArrayList<Goodie>(20);
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public ArrayList<Balloon> getBalloons() {
		return balloons;
	}

	public ArrayList<Goodie> getGoodies() {
		return goodies;
	}

	
	
	
	/*public void setGoodies(ArrayList<Goodie> goodies) {
		this.goodies = goodies;
	}
	public void setBalloons(ArrayList<Balloon> balloons) {
		this.balloons = balloons;
	}*/
	
}
