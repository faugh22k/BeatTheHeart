import org.newdawn.slick.*;

public class BalloonSprite extends BeatTheHeartSprite {
	
	//private Balloon balloon;

	public BalloonSprite(Balloon b) {
		super(b);
		//balloon = b;
	}

	public void init() throws SlickException {
		super.init();
		img = new Image("pics/heart_balloon_shineString_overlay.png");
	}

}
