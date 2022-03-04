import java.awt.Point;
import java.util.ArrayList;

public class CordRecursionMain {
	
	public static double distance(Point a, Point b) {
		
		return Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2));
	}
	
	public static ArrayList<Point> endResult(Point start, Point end, ArrayList<Point> noCords) {
		System.out.println(start);
		if(start == end){
			return new ArrayList<Point>();
		}
		Point pointUp = start;
		pointUp.y = start.y + 1;
		double distanceUp = distance(pointUp, end);
		
		Point pointDown = start;
		pointDown.y = start.y - 1;
		double distanceDown = distance(pointDown, end);
		
		Point pointRight = start;
		pointRight.x = start.x + 1;
		double distanceRight = distance(pointRight, end);
	
		Point pointLeft = start;
		pointLeft.x = pointLeft.x - 1;
		double distanceLeft = distance(pointLeft, end);
		
		//All possible ways:
		//up
		
		boolean up = true;
		boolean down = true;
		boolean left = true;
		boolean right = true;
		
		for(Point point : noCords) {
			if(pointUp == point) {
				up = false;
			}
			if(pointDown == point) {
				down = false;
			}
			if(pointRight == point) {
				right = false;
			}
			if(pointLeft == point) {
				left = false;
			}
		}
		
		if(up == true && distanceUp < distanceDown && distanceUp < distanceRight && distanceUp < distanceLeft) {
			ArrayList<Point> fin = new ArrayList<Point>();
			fin.add(pointUp);
			fin.addAll(endResult(pointUp, end, noCords));
		}
		
		//down
		if(down == true && distanceDown < distanceUp && distanceDown < distanceRight && distanceDown < distanceLeft) {
			ArrayList<Point> fin = new ArrayList<Point>();
			fin.add(pointDown);
			fin.addAll(endResult(pointDown, end, noCords));
		}
		
		//left
		if(left == true && distanceLeft < distanceUp && distanceLeft < distanceRight && distanceLeft < distanceDown) {
			ArrayList<Point> fin = new ArrayList<Point>();
			fin.add(pointLeft);
			fin.addAll(endResult(pointLeft, end, noCords));
		}
		
		//right
		if(right == true && distanceRight < distanceUp && distanceRight < distanceLeft && distanceRight < distanceDown) {
			ArrayList<Point> fin = new ArrayList<Point>();
			fin.add(pointRight);
			fin.addAll(endResult(pointRight, end, noCords));
		}
		
		return new ArrayList<Point>();
		
	}
	
	public static void main(String[] args) {
		System.out.println("Cords it has to go arround: ");
		ArrayList<Point> badCords = new ArrayList<Point>();
		badCords.add(new Point(1, 2));
		badCords.add(new Point(1, 1));
		badCords.add(new Point(1, 0));
		badCords.add(new Point(1, -1));
		badCords.add(new Point(1, -2));
		
	
		for(Point point : badCords) {
			System.out.print(point.toString() + " ");
		}
		
		Point startingPoint = new Point(0, 0);
		System.out.println("Starting Point: " + startingPoint);
		Point endPoint = new Point(2, 0);
		System.out.println("End Point: " + endPoint);
		
		ArrayList<Point> Results = endResult(startingPoint, endPoint, badCords);
		
		System.out.println("Fastest way to get from " + startingPoint + " to " + endPoint + ":");
		
		for(Point point : Results) {
			System.out.print(point.toString() + " ");
		}
		
	}
}
