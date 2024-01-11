package week2.day2;

import java.util.Arrays;

public class duplicate_intwoarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare and initialize two integer arrays, a and b
		    int a[]={3,2,11,4,6,7}; 
		    int b[]= {1,2,8,4,9,7}; 

        // Print the original contents of a and b.
        // System.out.println("Array a : " + Arrays.toString(a));
        // System.out.println("Array b : " + Arrays.toString(b));

        // Iterate through both arrays to find and print common elements.
            for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < b.length; j++)
        {
            if (a[i] == (b[j])) {
            System.out.println("Duplicate element element is : " + (a[i]));
        }
        }
 
	    }

	    }
}

