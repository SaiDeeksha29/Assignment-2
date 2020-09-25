/**
 * 
 */
package com.assignmentThree;

/**
 * @author saideeksha
 *
 */
public class LineComparison {

	/**
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Welcome message
		System.out.println("Welcome to Line Comparison Computation Program on Master Branch");

		// variables
		double x1 = (int) (Math.floor(Math.random() * 10));
		double x2 = (int) (Math.floor(Math.random() * 10));
		double y2 = (int) (Math.floor(Math.random() * 10));
		double y1 = (int) (Math.floor(Math.random() * 10));
		double x3 = (int) (Math.floor(Math.random() * 10));
		double x4 = (int) (Math.floor(Math.random() * 10));
		double y3 = (int) (Math.floor(Math.random() * 10));
		double y4 = (int) (Math.floor(Math.random() * 10));

		// Computation
		Point1 p1 = new Point1(x1, y1);
		Point1 p2 = new Point1(x2, y2);
		Point1 p3 = new Point1(x3, y3);
		Point1 p4 = new Point1(x4, y4);
		Line l1 = new Line(p1, p2);
		Line l2 = new Line(p3, p4);

		System.out.println("Length of Line 1 is : " + l1.length());
		System.out.println("Length of Line 2 is : " + l2.length());

		// Comparison by compareTo method
		int compareValue = l1.length().compareTo(l2.length());
		if (compareValue > 0) {
			System.out.println("Line 1 is greater than Line 2");
		}
		if (compareValue < 0) {
			System.out.println("Line 1 is smaller than Line 2");
		}
		if (compareValue == 0) {
			System.out.println("Both the lines are equal");
		}

		// Comparison by equals method
		boolean compareValue1 = l1.length().equals(l2.length());

		if (compareValue1) {
			System.out.println("Both the lines are equal");
		} else {
			System.out.println("Both the lines are not equal");
		}
	}

	public static class Line {
		private Point1 p1;
		private Point1 p2;

		public Line(Point1 p1, Point1 p2) {
			super();
			this.p1 = p1;
			this.p2 = p2;
		}

		public Double length() {
			return Math.sqrt((p1.getX() - p2.getX()) * (p1.getX() - p2.getX())
					+ (p1.getY() - p2.getY()) * (p1.getY() - p2.getY()));
		}

	}

	public static class Point1 {
		Double x;
		Double y;

		public Point1(Double x, Double y) {

			this.x = x;
			this.y = y;
		}

		public Double getX() {
			return x;
		}

		public Double getY() {
			return y;
		}

	}

}