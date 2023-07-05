package practiceproj;

public class Var_even_odd {

	public static void main(String[] args) {
		int odd=0,even=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				        
			            even++;
		       } 
			else {
				
				odd++;
				
			}
			
		}
		System.out.println("even count="+even);
		System.out.println("odd count="+odd);

	}

}
