package game;

import java.util.List;

public class GameStateManager {

	protected List<GameState> screens;
	protected GameState currentScreen;
	
	public void update(){
		currentScreen.update();
	}
}
