//******************************
//Assignment 2
//Student Name£º Ting Chen
//PIN: 21
//Description: Analytics class inherits from OrderedIntList class and 
// 			   has five methods: mean, median, high, low, numInts.
//******************************

package cse360assign2;

/**
 * Analytics class inherits from OrderedIntList and 
 * has five methods: mean, median, high, low, numInts.
 * @author Ting Chen
 * @version 1.0
 * @Date 5/30/2016
 */
public class Analytics extends OrderedIntList{
	
	/**
	 * constructor Analytics does nothing
	 * @param no parameter
	 * @return nothing
	 */
	Analytics(){
	
	}
	
	/**
	   * This method calculates mean of the list
	   * @param no parameter
	   * @return mean of the list
	   */	
	public double mean(){

		double sum = 0;
		
		if (count == 0 || array == null)
			return -1;
		
		else {
			for (int index = 0; index < count; index++)
				sum += array[index];
		
			return (sum / count);
		}
		
	}
	
	/**
	   * This method calculates median of the list
	   * @param no parameter
	   * @return median of the list
	   */
	public int median(){
		
		if (count == 0 || array == null)
			return -1;
		
		if (count % 2 == 0)
			return (array[count/2] + array[count/2 - 1]) / 2;
		else 
			return array[count/2];
		
	}
	
	/**
	   * This method finds the highest value of the list
	   * @param no parameter
	   * @return highest value of the list
	   */
	public int high(){
		
		if (count == 0 || array == null)
			return -1;
		
		return array[count - 1];
	}
	
	/**
	   * This method finds lowest value of the list
	   * @param no parameter
	   * @return lowest value of the list
	   */
	public int low(){
		
		if (count == 0 || array == null)
			return -1;
		
		return array[0];
	}
	
	/**
	   * This method calculates number of integers in the list
	   * @param no parameters
	   * @return number of integers in the list
	   */
	public int numInts(){
		
		if (count == 0 || array == null)
			return -1;
		
		return count;
	}

}
