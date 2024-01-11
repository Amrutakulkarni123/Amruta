package week2.day3;

public class count_e_value {

	public static void main(String[] args) 
	     {
		 
		 String input="TestLeaf";
		 int count = 0;    
		 char expCharacter = 'e' ;
         char[] ch = input.toCharArray();
         
	     for(int i = 0; i < ch.length; i++) 
	     {    
	        if(ch[i]==expCharacter)    
	        count++;    
	     }    
	            
	     System.out.println("expected char is: "+ expCharacter + " count is :" + count);    
	    
	 	 }    
	

		 }


