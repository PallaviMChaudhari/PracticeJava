package study_of_Generalization;

public class VI implements TRAI{

	public static void main(String[] args) {
		VI v=new VI();
		v.call();
		v.sms();
		v.internet();
		v.video_call();
		v.gps();
	}
	@Override
	public void call() {
		System.out.println("Ruchira calling Pallavi");
		
	}

	@Override
	public void sms() {
		System.out.println("Ruchira send sms to Vishal");
		
	}

	@Override
	public void internet() {
		System.out.println("Ruchira use data connection.. ");
		
		
	}

	@Override
	public void video_call() {
		System.out.println("Ruchira is making video call with Vishal");
		
	}
	
	public void gps() {
		System.out.println("Ruchira's location is Wagholi..");
	}

}
