//********************************************************************
//  ReboundPanel.java       Java Foundations
//
//  Represents the primary panel for the Rebound program.
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class ReboundPanel extends JPanel
{
	private final int WIDTH = 768, HEIGHT = 512;
	private final int DELAY = 20, IMAGE_SIZE = 35;

	private Ball []balls;
	private Timer timer;
	
	private Matrix xforms;
	
	Random rand = new Random();
	
	//-----------------------------------------------------------------
	//  Sets up the panel, including the timer for the animation.
	//-----------------------------------------------------------------
	public ReboundPanel()
	{

		
		timer = new Timer(DELAY, new ReboundListener());

		balls = new Ball[10];
		for (int i = 0; i < 10; i++)
			balls[i] = new Ball(rand.nextInt(WIDTH), rand.nextInt(HEIGHT), "src//happyFace.jpg");

		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setBackground(Color.black);
		
		timer.start();
	}

	//-----------------------------------------------------------------
	//  Draws the image in the current location.
	//-----------------------------------------------------------------
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		for (Ball ball : balls)
			ball.paintMe(this, page);
	}

	//*****************************************************************
	//  Represents the action listener for the timer.
	//*****************************************************************
	private class ReboundListener implements ActionListener
	{
		//--------------------------------------------------------------
		//  Updates the position of the image and possibly the direction
		//  of movement whenever the timer fires an action event.
		//--------------------------------------------------------------
		public void actionPerformed(ActionEvent event)
		{
			for (Ball ball : balls) {
				Matrix matrix = new Matrix(Math.PI/(rand.nextInt(100) + 100), ball.x, ball.y, WIDTH/2, HEIGHT/2);
				matrix.setup();
				matrix.matrixmultiply();
				double[] location = matrix.vectorMultiply();
				ball.x = location[0];
				ball.y = location[1];
			}
			repaint();
		}
	}
}
