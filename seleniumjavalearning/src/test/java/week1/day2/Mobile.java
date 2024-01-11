package week1.day2;

public class Mobile {
	
		//create a methods 
		public void makeCall(String string, float f) 
		{
			String mobileModel = "iphone";
		    float mobileWeight = 1.18f;
		    System.out.println("My mobile model is : "+ mobileModel +","+ " My mobile weight is : "+ mobileWeight);
		}
		
		public void sendMsg(boolean b, int i) 
		{

		    boolean FullCharged = true ;
			int mobileCost = 50000;
			
		System.out.println("Mobile is fullycharged "+ FullCharged);
		System.out.println("My mobile cost is :"+mobileCost);
		
		}
	
    	public static void main(String[] args) 
    	{
		// TODO Auto-generated method stub
		
		Mobile name = new Mobile();
		
		name.makeCall("iphone", 1.18f);
		name.sendMsg(false, 50000);
		System.out.println("This is my mobile information");
    	}
		}
