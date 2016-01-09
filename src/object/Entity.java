package object;
import java.awt.Graphics2D;

public abstract class Entity {

	protected String name;
	
	public Entity(String name){
		this.name = name;
	}
	
	public abstract void handleInput();
	
	public void update(){
		
	}
	
	public void draw(Graphics2D graph){
		
	}
}
