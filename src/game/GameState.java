package game;

import java.util.List;

import object.Entity;

public class GameState {

	protected List<Entity> entities;
	public void update(){
		for(Entity entity : entities){
			entity.update();
		}
	}
}
