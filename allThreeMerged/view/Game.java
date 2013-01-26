/*package view;

import org.newdawn.slick.*;
import beatTheHeart.Balloon;
import beatTheHeart.Goodie;
import beatTheHeart.Stuff;

public class Game extends BasicGame{

private View view;
 
  public Game()
  {
     super("Hello World");
    
  }
 
  @Override
  public void init(GameContainer gc) throws SlickException
  {
	  view = new View();
	  view.addBalloonSprite();
	  view.addBalloonSprite();
	  view.addBalloonSprite();
	  view.addGoodieSprite();
	  view.addGoodieSprite();
  }
 
  @Override
  public void update(GameContainer gc, int delta) throws SlickException
  {
	  view.update();
  }
 
  @Override
  public void render(GameContainer gc, Graphics g) throws SlickException
  {
     view.render(g);
  }
 
  public static void main(String[] args) throws SlickException
  {
     AppGameContainer app = new AppGameContainer(new Game());
    
     app.setDisplayMode(800, 600, false);
     app.start();
  }
}*/