package week2.day1;

public class Learnpelindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int lastDigit,a; 
		int sum=0;
		int input=121; //It is the number  to be checked for palindrome 
 
		a=input; 
        
        // Code to reverse a number
	    for( ;a != 0; a /= 10 )
		{   
	    	System.out.println("Input Number "+a);  
		lastDigit= a%10; //getting remainder  
			System.out.println("Last Digit "+lastDigit); 
			System.out.println("Digit "+lastDigit+ " was added to sum "+(sum*10)); 
			
		sum=(sum*10)+lastDigit;  
		a=a/10;
			
		}    
 
		// if given number equal to sum than number is palindrome otherwise not palindrome
		if(sum==input)    
			System.out.println("Number is palindrome ");    
		else    
			System.out.println("Number is not palindrome");      
        
		}

		}
