import org.newdawn.slick.*;
public class Game extends BasicGame{

private View view;
 
  public Game()
  {
     super("Beat the Heart");
    
  }
 
  @Override
  public void init(GameContainer gc) throws SlickException
  {
	  view = new View();
	  view.init(gc);
	  view.addBalloonSprite();
	  view.addBalloonSprite();
	  view.addBalloonSprite();
	  view.addGoodieSprite();
	  view.addGoodieSprite();
  }
 
  @Override
  public void update(GameContainer gc, int delta) throws SlickException
  {
	  view.update(gc, delta);
  }
 
  @Override
  public void render(GameContainer gc, Graphics g) throws SlickException
  {
     view.render(gc, g);
  }
 
  public static void main(String[] args) throws SlickException
  {
     AppGameContainer app = new AppGameContainer(new Game());
    
     app.setDisplayMode(1024, 768, false);
     app.start();
  }
}