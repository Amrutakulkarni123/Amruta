package week2.day2;

public class duplicatearrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={12,14,15,14,12,17,15};
		
		//int length = array.length;
		//System.out.println(length);
		
		for (int i=0; i<array.length;i++)
		{
			for (int j=i+1; j<array.length;j++) 
			{
				if(array[i] ==array[j]) 
				{
				System.out.println(array[j] +" Array has duplicate elements");
			}
		}
	}
	}
}
