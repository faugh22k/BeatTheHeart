

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.openal.SoundStore;


public class PlayMusic extends BasicGame {
	/** the GameContainer instance for this game*/
	private GameContainer myContainer;
	/** The music to be played */
	private Music music;
	
	private double[] changes = new double[5];
	
	
	String color= "";
	
	private static final int MESSAGE_X = 100 ;
	private static final int MESSAGE_Y = 50 ;
	
		
	/**
	 * Create a new test for sounds
	 */
	public PlayMusic() {
		super("Music Position Test");

		
		changes[0]=17;
		changes[1]=25;
		changes[2]=47;
		changes[3]=63;
		changes[4]=78;
	
		
	}
	
	/**
	 * @see org.newdawn.slick.BasicGame#init(org.newdawn.slick.GameContainer)
	 */
	public void init(GameContainer container) throws SlickException {
		SoundStore.get().setMaxSources(32);
		
		myContainer = container;
		// normal music
		// music = new Music( "ColeZeroGravity.ogg", true);
		
		// K-Pop song from Youtube
		music = new Music("heartbreaker.ogg", true);
		music.play();
		
		update(myContainer, 500 );
	}

	/**
	 * @see org.newdawn.slick.Ba sicGame#render(org.newdawn.slick.GameContainer, org.newdawn.slick.Graphics)
	 */
	public void render(GameContainer container, Graphics g) {


		if ( (int)music.getPosition() >= changes[0] && (int)music.getPosition() <= changes[0]+5){
			color = "red";
			g.setColor(Color.red);
			g.drawString( "Click on red balloons!" , MESSAGE_X , MESSAGE_Y ) ;
		}
		
		else if ( (int)music.getPosition() >= changes[1] && (int)music.getPosition() <= changes[1]+5)
		{
			color = "yellow";
			g.setColor(Color.yellow) ;
			g.drawString( "Click on yellow balloons!" , MESSAGE_X , MESSAGE_Y ) ;
		}
		else if ( (int)music.getPosition() >= changes[2] && (int)music.getPosition() <= changes[2]+5)
		{
			color = "black";
			g.setColor(Color.black) ;
			g.drawString( "Click on black balloons!" , MESSAGE_X , MESSAGE_Y ) ;
		}
		else if (  (int)music.getPosition() >= changes[3] && (int)music.getPosition() <= changes[3]+5)
		{
			color = "orange";
			g.setColor(Color.orange) ;
			g.drawString( "Click on orange balloons!" , MESSAGE_X , MESSAGE_Y ) ;
		}
		else if (  (int)music.getPosition() >= changes[4] && (int)music.getPosition() <= changes[4]+5)
		{
			color = "gray";
			g.setColor( Color.gray ) ;
			g.drawString( "Click on gray balloons!" , MESSAGE_X , MESSAGE_Y ) ;
		}
	}

	/**
	 * @see org.newdawn.slick.BasicGame#update(org.newdawn.slick.GameContainer, int)
	 */
	public void update(GameContainer container, int delta) {
	}

	/**
	 * @see org.newdawn.slick.BasicGame#keyPressed(int, char)
	 */
	public void keyPressed(int key, char c) {
		if (key == Input.KEY_SPACE) {
			if (music.playing()) {
				music.pause();
			} else {
				music.resume();
			}
		}
		if (key == Input.KEY_RIGHT) {
			music.setPosition(music.getPosition()+5);
		}
	}
	
	/**
	 * Entry point to the sound test
	 * 
	 * @param argv The arguments provided to the test
	 */
	public static void main(String[] argv) {
		try {
			AppGameContainer container = new AppGameContainer(new PlayMusic());
			container.setDisplayMode(800,600,false);
			container.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}
}