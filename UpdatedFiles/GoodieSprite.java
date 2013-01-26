import org.newdawn.slick.*;
import org.newdawn.slick.geom.Rectangle;

public class GoodieSprite extends BeatTheHeartSprite implements MouseListener{

	public GoodieSprite(){
		
	}
	
	public void init() throws SlickException {
		super.init();
		shape=new Rectangle(randomX, randomY,300, 400);
		img = new Image("pics/heart_frozen.png");
	}
	@Override
	public void mouseClicked(int arg0, int x, int y, int arg3) {
		if(shape.contains(x,y))
			exists=true;
		
	}

}