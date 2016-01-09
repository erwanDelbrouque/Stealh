package object.lock;

import java.awt.Graphics2D;

/*
 * KeyLock = serrure avec clé
 */
public class KeyLock extends Lock{
	
	public KeyLock(){
		super("key lock");
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
