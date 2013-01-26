import java.util.ArrayList;
import org.newdawn.slick.*;
import org.newdawn.slick.font.effects.ColorEffect;
import org.newdawn.slick.font.effects.ShadowEffect;


public class View implements MouseListener{

	private ArrayList<BeatTheHeartSprite> sprites;
	private Image background;
	protected ClubSprite club;
	private UnicodeFont unicodeFont1, unicodeFont2;
	private int score;

	
	public View() {
		sprites = new ArrayList<BeatTheHeartSprite>(41);
	}
	
	public void init(GameContainer gc) throws SlickException {
		
		background = new Image("pics/background.png");
		gc.setShowFPS(false);
		for(int i=0;i<41;i++)
		{
			BeatTheHeartSprite spr = addBalloonSprite();
			
			gc.getInput().addMouseListener(spr);
		}
		unicodeFont1 = new UnicodeFont("moonbeamslikerain.ttf", 48, false, false);
		unicodeFont1.getEffects().add(new ShadowEffect(java.awt.Color.black, 5, 5, 0.5f));
		unicodeFont1.getEffects().add(new ColorEffect(java.awt.Color.white));
		club=new ClubSprite();
		club.init();
		gc.getInput().addMouseListener(club);
	}
	
	public BeatTheHeartSprite addBalloonSprite() throws SlickException{
		BalloonSprite balloon = new BalloonSprite();
		balloon.init();
		sprites.add(balloon);
		return balloon;
	}
	
	public void addGoodieSprite() throws SlickException{
		GoodieSprite goodie = new GoodieSprite();
		goodie.init();
		sprites.add(goodie);
	}

	public void update(GameContainer gc, int delta) throws SlickException {
		for (int i = 0; i < sprites.size(); i++) {
			sprites.get(i).update();
		}
		unicodeFont1.loadGlyphs(1);
	}
	
	public void render(GameContainer gc,Graphics g) throws SlickException {
		
 		background.draw();
		for (int i = 0; i < sprites.size(); i++) {
			sprites.get(i).render(gc, g);
		}
		g.setColor(Color.white);
		String text = "SCORE: "+String.valueOf(score);
		unicodeFont1.drawString(720, 550, (text));
		club.render(gc,g);
	}

	@Override
	public void inputEnded() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inputStarted() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isAcceptingInput() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setInput(Input arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(int arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(int arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseWheelMoved(int arg0) {
		// TODO Auto-generated method stub
		
	}

}