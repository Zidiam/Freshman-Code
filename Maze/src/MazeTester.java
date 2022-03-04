/*
 * MazeTester -- Tests our maze and if there is a possible way to go through a maze
 * Jason Melnik
 * CSC - 121
 * 3/21/2019
 */
import java.awt.Point;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MazeTester {
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name of the file containing the maze: ");
		String filename = scan.nextLine();
		
		System.out.println("Enter the starting point(row col): ");
		Point start = new Point(scan.nextInt(), scan.nextInt());
		
		System.out.println("Enter the end point(row, col): ");
		Point end = new Point(scan.nextInt(), scan.nextInt());
		
		Maze labyrinth = new Maze(filename);
		
		System.out.println(labyrinth);
		
		MazeSolver solver = new MazeSolver(labyrinth);
		
		if(solver.traverse(start, end))
			System.out.println("The maze was successfully travered!");
		else
			System.out.println("There is no possible path");
		
		System.out.println(labyrinth);
		
	}
}
