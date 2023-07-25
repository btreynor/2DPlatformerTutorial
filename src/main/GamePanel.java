package main;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
import inputs.KeyboardInputs;
import inputs.MouseInputs;
import static main.Game.GAME_HEIGHT;
import static main.Game.GAME_WIDTH;

public class GamePanel extends JPanel {
	
	private MouseInputs mouseInputs;	
	private Game game;
	
	//set up your constructor
    //game panel is the picture
    //jFrame is the frame
	public GamePanel(Game game) {
		
		mouseInputs = new MouseInputs(this);
		
		this.game = game;
			
		setPanelSize();
		
		//adding keyboard inputs
		//this listens to the keyboard
		addKeyListener(new KeyboardInputs(this));
		
		//add mouse inputs
		//this listens to the mouse
		addMouseListener(mouseInputs);
		addMouseMotionListener(mouseInputs);
	}
	


	//setting the actual game size
	private void setPanelSize() {
		Dimension size = new Dimension(GAME_WIDTH, GAME_HEIGHT);
		setPreferredSize(size);
		
		
	}
	
	public void updateGame() {
	
	}
	
	//paint component is called when we press play button
    //takes care of any drawing we might 
    //have made but only if we create this method
    //graphics is how you draw
    //we use graphics as input so we can draw
    public void paintComponent(Graphics g) {      
        //calls superclass jcomponent's paintComponents
        //we use it so there isn't any glitching
        //its like a cleaning surface so nothing comes over from
        //previous frame
        super.paintComponent(g);
        game.render(g);
       
    }

	public Game getGame() {
		return game;
	}	
}
