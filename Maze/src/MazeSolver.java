/*
 * MazeSolver -- Solves our maze
 * Jason Melnik
 * CSC - 121
 * 3/21/2019
 */
import java.awt.Point;
import java.util.*;

//Position == point, Point accepts x, and y; So just assume x is row, and y is column.
public class MazeSolver {
	private Maze maze;
	
	public MazeSolver(Maze maze) {
		this.maze = maze;
	}
	
	public boolean traverse() {
		boolean done = false;
		int row, column;
		Point pos = new Point();
		Deque<Point> stack = new LinkedList<Point>();
		stack.push(pos);
		while(!(done) && !stack.isEmpty()) {
			pos = stack.pop();
			maze.tryPosition(pos.x, pos.y);
			if(pos.x == maze.getRows() - 1 && pos.y == maze.getColumns() - 1) {
				done = true;
			}
			else
			{
				push_new_pos(pos.x - 1, pos.y, stack);
				push_new_pos(pos.x + 1, pos.y, stack);
				push_new_pos(pos.x, pos.y - 1, stack);
				push_new_pos(pos.x, pos.y + 1, stack);
			}
		}
		return done;
	}
	
	public boolean traverse(Point start, Point end) {
		boolean done = false;
		int row, column;
		row = start.x;
		column = start.y;
		Point pos = new Point(row, column);
		Deque<Point> stack = new LinkedList<Point>();
		stack.push(pos);
		while(!(done) && !stack.isEmpty()) {
			pos = stack.pop();
			maze.tryPosition(pos.x, pos.y);
			if(pos.x == end.x && pos.y == end.y) {
				done = true;
			}
			else
			{
				push_new_pos(pos.x - 1, pos.y, stack);
				push_new_pos(pos.x + 1, pos.y, stack);
				push_new_pos(pos.x, pos.y - 1, stack);
				push_new_pos(pos.x, pos.y + 1, stack);
			}
		}
		return done;
	}
	
	private void push_new_pos(int x, int y, Deque<Point> stack)
	{
		Point npos = new Point();
		npos.x = x;
		npos.y = y;
		if(maze.validPosition(x, y))
			stack.push(npos);
	}
	
}
