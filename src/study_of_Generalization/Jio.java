package study_of_Generalization;

public class Jio implements TRAI{

	public static void main(String[] args) {
		Jio j=new Jio();
		j.call();
		j.sms();
		j.internet();
		j.video_call();
		

	}

	@Override
	public void call() {
		System.out.println("Pallavi calling Ruchira");
		
	}

	@Override
	public void sms() {
		System.out.println("Pallavi send sms to Vishal");
		
	}

	@Override
	public void internet() {
		System.out.println("Pallavi use data connection.. ");
		
		
	}

	@Override
	public void video_call() {
		System.out.println("Pallavi is making video call with Ruchira");
		
	}

}
