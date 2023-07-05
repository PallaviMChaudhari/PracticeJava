package studyOfCasting;

public class NonPrimiCast extends CastingType{

	public static void main(String[] args) {
		CastingType cs=new NonPrimiCast();
		cs.demo();
		cs.demo();
		
	}
	public void demo() {
		System.out.println("subclass method");
	}
	public void display() {
		System.out.println("Child class method");
	}

}
