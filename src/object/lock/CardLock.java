package object.lock;

import java.awt.Graphics2D;

/*
 * LockCard = serrure à ouverture par carte
 */
public class CardLock extends Lock{
	
	public CardLock(){
		super("card lock");
	}
	
	@Override
	public void handleInput() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void draw(Graphics2D graph) {
		// TODO Auto-generated method stub
		super.draw(graph);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		super.update();
	}
}
