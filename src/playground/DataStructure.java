package playground;

import java.util.Arrays;

public class DataStructure {

	// 1.Write a program to sum all the values of a given Array in Java.

	public static int arraySum(int[] arr) {
		int mysum = 0;
		for (int i = 0; i < arr.length; i++) {
			mysum = mysum + arr[i];
		}
		// for debug we can write
		// System.out.println(mysum);
		return mysum;
	}

	//Write a public static method called "toPower" 

	public static int[] toPower(int size, int power) {
		int[] result = new int[size];

		for (int i = 0; i < size; i++) {
			result[i] = i * i;
		}

		return result;
	}

	public static void main(String[] args) {
        // now executing code for part1 of assignment.
		int[] sumArray1 = { 1, 5, 6, 5, 4, 1 };
		int arraytotal;
		arraytotal = arraySum(sumArray1);
		System.out.printf("The sum all the values of a given Array is: %d \n", arraytotal);

		// 2. what is the output.
        // now executing code for part2 of assignment.

		double[] exampleArray = { 1, 5, 6, 5, 4, 1 };
		double maximum = exampleArray[0];

		int index = 0;
		for (int i = 1; i < exampleArray.length; i++) {
			if (exampleArray[i] > maximum) {
				maximum = exampleArray[i];
				index = i;
			}
		}
		System.out.printf("maximum number of array is: %f and it is at position %d in array \n", maximum, index);

		// WORKING on METHOD just an example of math power :

		int base = 5;
		int exp = 2;

		// to print array use example - System.out.println(Arrays.toString(array));
        // now executing code for part3 of assignment.
		System.out.println(Arrays.toString(toPower(base, exp)));
			
	}

}
