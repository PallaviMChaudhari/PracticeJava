package practiceproj;

public class Var_fib {

	public static void main(String[] args) {
		int i=1,j=0;
		for(int k=0;k<=100;k++) {
		if(j<=1) {
			System.out.println(i);
			j++;
		}
		else {
		   
			System.out.println(j);
			k=i+j;
			i=j;
			j=k;
		    }
		}
	}

}
