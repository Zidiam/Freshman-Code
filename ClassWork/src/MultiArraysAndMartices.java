import java.util.Random;

/*
 * 
 */
class Pixel{
	int r, g, b;
}

class Image{
	int width, height;
	Pixel [][]im;
	
	public Image(int width, int height) {
		im = new Pixel[height][];
		for(int row = 0; row < width; row++) {
			im[row] = new Pixel[width];
		}
		Pixel []row = new Pixel[5];
		im[7] = row;
	}
}
public class MultiArraysAndMartices {
	public static void main(String[] args) {
		Random rand = new Random();
		int[][][][] myArr = new int[8][8][8][8];
		myArr[rand.nextInt(8)][rand.nextInt(8)][rand.nextInt(8)][rand.nextInt(8)] = 1;
		
		int a = 0, b = 0, c = 0, d = 0;
		
		try {
			for(a = 0; a<8; a++) {
				for(b = 0; b < 8; b++) {
					for(c = 0; c < 8; c++) {
						for(d = 0; d < 8; d++) {
							if(myArr[a][b][c][d] == 1) {
								throw new Exception("The 1 was found");
							}
							
						}
					}
				}
			}
			System.out.println("The one was not found");
		}
		catch(Exception e) {
			System.out.println("found 1");
		}
	}
}
