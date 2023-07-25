package main;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;

public class GameWindow {
	
	private JFrame jframe;
	
	public GameWindow(GamePanel gamePanel) {
		
		//create jFrame object
		jframe = new JFrame();
        
        //make it close when you hit the close button
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //add your game panel
        //needs to be before the set visible is true
        jframe.add(gamePanel);
        
        //we don't want to resize the window
        //it will look bad
        jframe.setResizable(false);
        
        //telling the frame to fit the preferred size component
        jframe.pack();
        
        //spawn the window in the center of our screen
        jframe.setLocationRelativeTo(null);
        
        //make it visible
        //this should be at the bottom
        jframe.setVisible(true);
        
        jframe.addWindowFocusListener(new WindowFocusListener() {

			@Override
			public void windowGainedFocus(WindowEvent e) {
				gamePanel.getGame().windowFocusLost();
				
			}

			@Override
			public void windowLostFocus(WindowEvent e) {
				// TODO Auto-generated method stub
			
			}		
		});
        
      }
		
}


