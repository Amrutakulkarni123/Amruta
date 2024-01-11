package week2.day1;

public class pelindrome_number_assig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=1212;
		int temp,rem;
		
		int org=input;
		for(temp=0;org>0;org=org/10) {
			
			rem=org%10;
			temp=(temp*10)+rem;
		}
		if (temp==input) {
			System.out.println("The given number is pelindrome");
		}
		else {
			System.out.println("The given number is not pelindrome");
		}

	}

}
