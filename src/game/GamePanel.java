package game;

import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GamePanel() {
		this.setPreferredSize(new Dimension(640,480));
		this.setSize(getPreferredSize());
	}
	
	public void run(){
		
	}
}
