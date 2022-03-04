import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class SnakeGamePanel extends JPanel{
	private final int WIDTH = 250, HEIGHT = 250;
	private final int JUMP = 10;
	private final int DELAY = 20;
	
	private final int IMAGE_SIZE = 10;
	
	private ImageIcon squareImg, appleImg;
	
	private ArrayList<ImageIcon> ImageList = new ArrayList<ImageIcon>();
	
	private Timer timer;
	
	private int x, y;
	
	private boolean left, right, up, down = false;
	
	public SnakeGamePanel() {
		addKeyListener(new DirectionListener());
		timer = new Timer(DELAY, new ReboundListener());
		
		ImageLoader();
		
		for(int i = 0; i < 5; i++) {
			ImageList.add(squareImg);
		}
		
		x = WIDTH/2;
		y = HEIGHT/2;
		
		setBackground(Color.WHITE);
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setFocusable(true);
		timer.start();
		
	}
	
	public void ImageLoader() {
		ImageIcon test = new ImageIcon("src\\square.png");
		Image img = test.getImage();
		BufferedImage bi = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
		Graphics g = bi.createGraphics();
		g.drawImage(img, 0, 0, IMAGE_SIZE, IMAGE_SIZE, null);
		squareImg = new ImageIcon(bi);
		
		test = new ImageIcon("src\\apple.png");
		img = test.getImage();
		bi = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
		g = bi.createGraphics();
		g.drawImage(img, 0, 0, IMAGE_SIZE, IMAGE_SIZE, null);
		appleImg = new ImageIcon(bi);
		
	}
	
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		for(int i = 0; i < ImageList.size(); i++) {
			squareImg.paintIcon(this, page, x, y);
			appleImg.paintIcon(this, page, 50, 50);
		}
	}
	private class DirectionListener implements KeyListener{
		public void keyPressed(KeyEvent event) {
			switch(event.getKeyCode()) {
			case KeyEvent.VK_W:
				up = true;
				left = false;
				right = false;
				down = false;
				break;
			case KeyEvent.VK_A:
				up = false;
				left = true;
				right = false;
				down = false;
				break;
			case KeyEvent.VK_S:
				up = false;
				left = false;
				right = false;
				down = true;
				break;
			case KeyEvent.VK_D:
				up = false;
				left = false;
				right = true;
				down = false;
				break;
			}
			repaint();
		}
		public void keyTyped(KeyEvent event) {}
		public void keyReleased(KeyEvent event) {}
	}
	
	private class ReboundListener implements ActionListener
	{
		//--------------------------------------------------------------
		//  Updates the position of the image and possibly the direction
		//  of movement whenever the timer fires an action event.
		//--------------------------------------------------------------
		public void actionPerformed(ActionEvent event)
		{
			if (left == true){
				x -= JUMP;
			}
			if (right == true){
				x += JUMP;
			}
			if (up == true){
				y -= JUMP;
			}
			if (down == true){
				y += JUMP;
			}

			repaint();
		}
	}
}
	
	

