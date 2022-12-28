package week1.day1;

public class Mobile {
	
	public void sendSMS()
	{
		System.out.println("sms sent.");
	}
	public void takeSnap()
	{
		System.out.println("snap taken.");
	}
	public static void main(String[] args) {
		Mobile obj=new Mobile();
		obj.sendSMS();
		obj.takeSnap();
	}
}
