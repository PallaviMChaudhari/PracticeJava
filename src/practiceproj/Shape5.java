package practiceproj;

public class Shape5 {

	public static void main(String[] args) {
		String j=" ";
		String str = "* ";	
		int a=55;
		int b= a;int c=a;
		for(int i=0;i<=b;i++) {
            System.out.print( j.repeat(a) );
            System.out.print(str.repeat(i));
            System.out.println();
            a--;  
		}
		c--;
		for(int k=1;k<=b;k++) {
			System.out.print(j.repeat(k));
			System.out.print(str.repeat(c));
			System.out.println();
			c--;
			
		}
	   
	}

}
