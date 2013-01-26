package beatTheHeart;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Point2D;
import javax.swing.Timer;

import com.adamtaft.eb.EventBusService;
import com.adamtaft.eb.EventHandler;
 

public class Controller implements ActionListener{
	
	private Data data;
	//private View view;
	private int BALLOON_SPEED;
	private int GOODIE_SPEED;
	private int WIDTH;
	private int HEIGHT;
	private int total;
	private Timer timer;
	private int updateFrequency;
	private int balloonsFrozen;
	
	public Controller(){
		data = new Data();
		BALLOON_SPEED = 5;
		GOODIE_SPEED = 7;
		WIDTH = 1024;
		HEIGHT = 768;
		total = 0;
		updateFrequency = 4000;
		balloonsFrozen = 0;
		
		timer = new Timer(updateFrequency, this);
		 
	} 
	 
	
	@EventHandler
	public void handleCreateBalloonEvent(CreateBalloonEvent event){
		System.out.println("a create event has reached the handler function! event.id = " + event.getId());
		createBalloon();
	}
	
	@EventHandler
	public void handleStuffClickedEvent(StuffClickedEvent event){
		System.out.println("balloon clicked! event.id = " + event.getId());
		Stuff tmp = data.getItem(event.getId()); 
		
		if (tmp.getClass().equals(Balloon.class)){ 
			Balloon balloon = (Balloon) tmp;
			
			createGoodie(balloon.position);
			balloon.setNumberOfClicks(((Balloon) tmp).getNumberOfClicks() + 1);
		
			if(((Balloon) tmp).getNumberOfClicks() > ((Balloon) tmp).getLimit()){
				popBalloon();
			}
			
		} else {
			Goodie goodie = (Goodie) tmp;
			
			if(goodie.getType() == GoodieTypes.fivePoints){
				data.setScore(data.getScore() + 5);
			} 
			
			else if(goodie.getType() == GoodieTypes.tenPoints){
				data.setScore(data.getScore() + 10);
			}
			
			else if(goodie.getType() == GoodieTypes.freeze){
				data.changeMotion(false);
				balloonsFrozen = 1;
			}
		}
		
	}
	
	public void popBalloon(){
		
	}
	
	public void createBalloon(){
		System.out.println("in createBalloon");
		double randomX = Math.random();
		double randomY = Math.random();
		
		//System.out.println("x = " + randomX + ", y = " + randomY);
		
		randomX *= WIDTH;
		randomY *= HEIGHT;
		
		//System.out.println("x = " + randomX + ", y = " + randomY);
		
		Point2D.Double point = new Point2D.Double(randomX, randomY);
		
		data.addBalloon(BALLOON_SPEED, point, total);
		total++;
		
		
		data.update();
	}
	
	public void createGoodie(Point2D.Double point){
		data.addGoodie(GOODIE_SPEED, point, total);
		total++;
		
		data.update();
	}
	

	public static void main(String[] args) throws Exception
	{
		System.out.println("program running.");
		
		Controller controller = new Controller();
		EventBusService.subscribe(controller);
		
		EventBusService.publish((new CreateBalloonEvent(10))); 
		
		while (EventBusService.hasPendingEvents()) {
			Thread.sleep(50);
		}
		EventBusService.publish((new StuffClickedEvent(0))); 	
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		EventBusService.publish((new CreateBalloonEvent(total))); 
		
		if(balloonsFrozen != 0){
			if(balloonsFrozen == 3){
				data.changeMotion(true);
				balloonsFrozen = 0;
			} else {
				balloonsFrozen++;
			}
		}
		
	}
	 
}
