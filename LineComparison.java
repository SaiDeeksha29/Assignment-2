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
		double line = 0;

		double x1 = (int) (Math.floor(Math.random() * 10));
		double x2 = (int) (Math.floor(Math.random() * 10));
		double y2 = (int) (Math.floor(Math.random() * 10));
		double y1 = (int) (Math.floor(Math.random() * 10));

		// Computation
		line = (Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1))));

		System.out.println("Length of the line is : " + line);

	}

}