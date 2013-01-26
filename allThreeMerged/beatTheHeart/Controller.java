package beatTheHeart;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Point2D;
import java.util.Random;

import javax.swing.Timer;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import view.View;

import com.adamtaft.eb.EventBusService;
import com.adamtaft.eb.EventHandler;
 

public class Controller implements ActionListener{
	
	private Data data;
	private View view;
	private int BALLOON_SPEED;
	private int GOODIE_SPEED;
	private double WIDTH;
	private double HEIGHT;
	private int total;
	private Timer timer;
	private int updateFrequency;
	private int balloonsFrozen;
	private Random random;
	private int balloonsToAdd;
	
	public Controller(){
		data = new Data();
		view = new View();
		
		BALLOON_SPEED = 3;
		GOODIE_SPEED = 7;
		WIDTH = 1024.0;
		HEIGHT = 768.0;
		total = 0;
		
		updateFrequency = 4000;
		balloonsFrozen = 0;
		random = new Random();
		
		balloonsToAdd = 0;
		
		timer = new Timer(updateFrequency, this); 
		
		
		 
	} 
	 
	public void init(GameContainer container){
		timer.start();
		try {
			view.init(container);
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//createBalloon();
	}
	
	@EventHandler
	public void handleCreateBalloonEvent(CreateBalloonEvent event){
		System.out.println("                                        create balloon event " + event.getId());
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
			balloon.setSpeed(-5);
		
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
	
	public void update(){
		System.out.println("ballonsToAdd = " + balloonsToAdd);
		for(int i = balloonsToAdd; i > 0; i--){
			createBalloon();
		}
		balloonsToAdd = 0;
		
		
		data.update();
		try {
			view.update();
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void render(GameContainer container, Graphics graphics){
		try {
			view.render(graphics);
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void popBalloon(){
		
	}
	
	public void createBalloon(){
		System.out.println("in createBalloon");
		
		double randomX = random.nextDouble();
		double randomA = random.nextDouble();
		
		//System.out.println("x = " + randomX + ", y = " + randomY);
		
		randomX *= WIDTH;
		
		randomA += .5;
		randomA *= 4;
		
		//System.out.println("x = " + randomX + ", y = " + randomY);
		
		Point2D.Double point = new Point2D.Double(randomX, HEIGHT);
		
		Balloon tmp = data.addBalloon(BALLOON_SPEED, point, total, (int) randomA);
		total++;
		
		try {
			view.addBalloonSprite(tmp);
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//update();
	}
	
	public void createGoodie(Point2D.Double point){
		
		Goodie tmp = data.addGoodie(GOODIE_SPEED, point, total);
		total++;
		
		try {
			view.addGoodieSprite(tmp);
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		update();
	}
	

	/*public static void main(String[] args) throws Exception
	{
		System.out.println("program running.");
		
		Controller controller = new Controller();
		EventBusService.subscribe(controller);
		
		EventBusService.publish((new CreateBalloonEvent(10))); 
		
		while (EventBusService.hasPendingEvents()) {
			Thread.sleep(50);
		}
		EventBusService.publish((new StuffClickedEvent(0))); 	
	}*/


	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("timer has called for action!");
		
		balloonsToAdd++;
		
		//EventBusService.publish((new CreateBalloonEvent(total))); 
		//createBalloon();
		
		//timer.stop();
		
		/*EventBusService.publish((new CreateBalloonEvent(total))); 
		
		if(balloonsFrozen != 0){
			if(balloonsFrozen == 3){
				data.changeMotion(true);
				balloonsFrozen = 0;
			} else {
				balloonsFrozen++;
			}
		}*/
		
		
		
	}
	 
}
