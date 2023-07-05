package practiceproj;

public class Shape1 {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++) {
			
			for(int j=5;j>=i;j--){
				if(j>i) {
					System.out.print(" ");
				}
				else {
					for(int p=0;p<=i;p++) {
				    System.out.print("*");
					}
				}
			}
			System.out.println();
		}
	

	}

}
