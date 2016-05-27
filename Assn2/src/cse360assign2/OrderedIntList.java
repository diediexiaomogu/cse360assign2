//******************************
//Assignment 2
//Student Name£º Ting Chen
//PIN: 21
//Description: the OrderedIntList program implements that
//             insert a new value into the array so that the
//             array remains in ascending order.
//******************************

package cse360assign2;

/**
 * the OrderedIntList program implements that
 * insert a new value into the array so that the
 * array remains in ascending order.
 * @author Ting Chen
 * 
 */

public class OrderedIntList {
	
	protected int[] array;
	protected int count; 
	private boolean debug = true;
	
	/**
	 * class Constructor initialize an array of ten size
	 * @parameter no parameter
	 * @return nothing
	 */
	
	OrderedIntList () {
		array = new int[10];
	}
	
	 /**
	   * This method is used to add a value into the array so
	   * that after insertion, the array remains in ascending order.
	   * @param value This is the parameter to insert method
	   * @return nothing
	   */
	
	public void insert(int value) {
		
		if (debug){
			System.out.print("debug - value = " + value + "  ");
		}
		
		if (count == array.length)
			grow();
		
		if (count == 0){
			array[0] = value;
			count++;
			}
		
		else {
			int index = 0;
			int index1 = 0;
			
			while (index < count && value >= array[index]){
				index++;
				index1++;
			}
			
			for (index = count; index > index1; index--) 
				array[index] = array[index - 1];
			
			array[index1] = value; 
			count++;
			}
		
		if (debug){
			System.out.print("debug - count = " + count + "\n");
			
		}
	}
	
	 /**
	   * This method is used to expand the array size to hold
	   * all values when insert more than 10 values.
	   * @param no parameter
	   * @return nothing
	   */
	
	private void grow(){
		
		int []temp = new int[count * 2];
		
		for (int index = 0; index < count; index++)
			temp[index] = array[index];
		
		array = temp;
	}
	
	/**
	   * This method is used to print the array to the 
	   * screen. When the index is divisible by 5, start
	   * printing from a new line.
	   * @param no parameter
	   * @return nothing
	   */
	
	public void print(){
		
		for (int index = 0; index < count; index++){			
			if (index % 5 == 0) 
				System.out.println();
			
			System.out.print(array[index] + "\t");	
		  }
		System.out.println();
	}
	
}
