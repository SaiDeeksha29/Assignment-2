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
		double line1 = 0, line2 = 0;

		int x1 = (int) (Math.floor(Math.random() * 10));
		int x2 = (int) (Math.floor(Math.random() * 10));
		int y1 = (int) (Math.floor(Math.random() * 10));
		int y2 = (int) (Math.floor(Math.random() * 10));
		int x3 = (int) (Math.floor(Math.random() * 10));
		int x4 = (int) (Math.floor(Math.random() * 10));
		int y3 = (int) (Math.floor(Math.random() * 10));
		int y4 = (int) (Math.floor(Math.random() * 10));

		// Computation
		line1 = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
		line2 = Math.sqrt(((x4 - x3) * (x4 - x3)) + ((y4 - y3) * (y4 - y3)));
		System.out.println("Length of Line 1 is : " + line1);
		System.out.println("Length of Line 2 is : " + line2);

		// Comparison by equals method
		Double obj1 = new Double(line1);
		Double obj2 = new Double(line2);
		boolean compareValue = obj1.equals(obj2);

		if (compareValue) {
			System.out.println("Both the lines are equal");
		} else {
			System.out.println("Both the lines are not equal");
		}

	}

}