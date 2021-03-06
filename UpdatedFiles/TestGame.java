import org.newdawn.slick.*;
public class TestGame extends BasicGame{

private Image heart;
 
  public TestGame()
  {
     super("Hello World");
    
  }
 
  @Override
  public void init(GameContainer gc) throws SlickException
  {
	  heart = new Image("heart.png");
  }
 
  @Override
  public void update(GameContainer gc, int delta) throws SlickException
  {
	  
  }
 
  @Override
  public void render(GameContainer gc, Graphics g) throws SlickException
  {
     g.drawString("Hello World", 100, 100);
     g.drawImage(heart, 5, 5);
  }
 
  public static void main(String[] args) throws SlickException
  {
     AppGameContainer app = new AppGameContainer(new TestGame());
    
     app.setDisplayMode(800, 600, false);
     app.start();
  }
}