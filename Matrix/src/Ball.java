/*
 * Ball.java -- a Ball
 * Jason Melnik
 * 1/28/2019
 */

import java.awt.Component;
import java.awt.Graphics;
import javax.swing.ImageIcon;

class Ball {
	ImageIcon image;
	public double x, y;
	
	public Ball(int x, int y, String picture) {
		this.x = x;
		this.y = y;
		image = new ImageIcon(picture);
	}
	
	public void paintMe(Component j, Graphics g) {
		image.paintIcon(j, g, (int) x, (int) y);
	}
	
	public void transform(Matrix m) { }
	
	public void rotateAboutPoint(double theta, double cx, double cy) {
		
		x -= cx;
		y -= cy;
		
		double nx = x*Math.cos(theta) - y*Math.sin(theta);
		double ny = x*Math.sin(theta) + y*Math.cos(theta);
		
		x = nx + cx;
		y = ny + cy;
	}
	
	public static void main(String[] args) {
		Ball ball1 = new Ball(10, 25, "test");
		ball1.rotateAboutPoint(Math.PI/200, 250, 250);
		System.out.println(ball1.x + ", " + ball1.y);
	}
}