package week2.day2;

import java.util.Arrays;

public class missingNo {
	
	public static void main(String[] args) 
	{

    int arr[]= {1,2,3,5,6,7};
	
	{
		
	Arrays.sort(arr);

	System.out.println(Arrays.toString(arr));

	for(int i=1;i<=arr.length;i++) 
	{

	if(i!=arr[i-1]) 
	{

	System.out.println("missing no is :"+i);

	break;

	}

	}		
	}
	}
    }
