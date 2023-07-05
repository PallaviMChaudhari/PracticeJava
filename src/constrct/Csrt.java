package constrct;

public class Csrt {
	int rollNo;
	String name;
	char gen;
	
	public Csrt() {
		rollNo=5;
		name="pallavi";
		gen='f';
	}
	
	public Csrt(int a) {
		rollNo=a;
		gen='m';
	}
	public Csrt(int a, String b,char c ) {
		rollNo=a;
		name=b;
		gen=c;		
	}
	

	public static void main(String[] args) {
		
		Csrt cs=new Csrt();
		cs.display();
		Csrt cs1=new Csrt(9);
		cs1.display();
		Csrt cs2=new Csrt(1, "riddhi", 'f');
		cs2.display();
		

	}
	
	public void display() {
		System.out.println("Name is :"+name);
		System.out.println("RollNo is :"+rollNo);
		System.out.println("Gender is :"+gen);
	}

}
