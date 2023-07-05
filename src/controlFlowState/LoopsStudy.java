package controlFlowState;

public class LoopsStudy {

	public static void main(String[] args) {
		System.out.println("print 1 to 10 :");
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
		System.out.println("print 10 to 1:");
		
		int i=10;
		while(i>=1) {
			System.out.println(i);
			i--;
		}
		System.out.println("print table of 2 :");
		int j=2;
		do {
			
			System.out.println(j);  //2,4
			
		   j=j+2;	//4,6
		}while(j<=20);
	

	}

}
