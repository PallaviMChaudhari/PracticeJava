package study_of_Generalization;

public class Airtel implements TRAI {

	public static void main(String[] args) {
		Airtel a=new Airtel();
		a.call();
		a.sms();
		a.internet();
		a.video_call();
		a.dataTrasfer();
		
	}

	@Override
	public void call() {
		System.out.println("Vishal calling Ruchira");
		
	}

	@Override
	public void sms() {
		System.out.println("Vishal send sms to Pallavi");
		
	}

	@Override
	public void internet() {
		System.out.println("Vishal use data connection.. ");
		
		
	}

	@Override
	public void video_call() {
		System.out.println("Vishal is making video call with Ruchira");
		
	}
	
	public void dataTrasfer() {
		System.out.println("Vishal transfer data..");
	}
}
