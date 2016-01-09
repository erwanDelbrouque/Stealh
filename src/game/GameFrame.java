package game;

import javax.swing.JFrame;

public class GameFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected GamePanel gamePanel; 
	public GameFrame(){
		gamePanel = new GamePanel();
		this.setContentPane(gamePanel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
