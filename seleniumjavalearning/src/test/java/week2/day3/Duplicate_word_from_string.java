package week2.day3;

public class Duplicate_word_from_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String input  = "we learn java basics as part of java sessions in java week1";
		 System.out.println(input);
		 
		 int count = 0;
		
		 char[] chars =input.toCharArray();
		 System.out.println("Duplicate characters are :");
		 
		 for (int i=0; i< input.length();i++) 
		 {
		 for(int j=i+1; j<input.length();j++) 
		 {
			if(chars[i]==chars[j]) {
			System.out.print(chars[j]);
			count++;
			break;
		 }
		 }
		 }
		 }

         }
