//******************************
//Assignment 2
//Student Name£º Ting Chen
//PIN: 21
//Description: The TestAnalytics program contains a main method and test
//             all local and inherited methods in Analytics class.
//******************************

package cse360assign2;

/**
 * The TestAnalytics program contains a main method and test
 * all local and inherited methods in Analytics class
 * @author Ting Chen
 * @version 1.0
 */
class TestAnalytics {
	
	/**
	 * main method used to test all local and inherited
	 * methods in Analytics class.
	 * @param args
	 * @return nothing
	 */
	public static void main(String[] args) {
		
		int array[] = {};
		
		Analytics analytics = new Analytics();
		
		
		for (int index = 0; index < array.length; index++)
			analytics.insert(array[index]);
		
		System.out.println("\n" + "Print the array: ");
		analytics.print();
		System.out.println("\n" + "mean of the list: " + analytics.mean());
		System.out.println("\n" + "median of the list: " + analytics.median());
		System.out.println("\n" + "low value of the list: " + analytics.low());
		System.out.println("\n" + "high value of the list: " + analytics.high());
		System.out.println("\n" + "number of integers in the list: " + analytics.numInts());
		
	}

}
