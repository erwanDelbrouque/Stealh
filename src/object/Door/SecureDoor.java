package object.Door;

import java.awt.Graphics2D;

import object.lock.CardLock;

public class SecureDoor extends Door {
	
	public SecureDoor() {
		super("Secure door", new CardLock());
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

	@Override
	public void openDoor() {
		// TODO Auto-generated method stub
		
	}
}
