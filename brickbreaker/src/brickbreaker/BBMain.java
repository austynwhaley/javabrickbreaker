package brickbreaker;

import javax.swing.JFrame;

public class BBMain {
	//state the size of class
	public static final int WIDTH = 640, HEIGHT = 480;

	public static void main(String[] args) {

		//code for starting window
		JFrame theFrame = new JFrame("Brick Breaker");
		theFrame.setLocationRelativeTo(null);
		theFrame.setResizable(false);
		theFrame.setSize(WIDTH, HEIGHT);
		theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theFrame.setVisible(true);
	}

}
