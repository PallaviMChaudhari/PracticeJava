package practiceproj;

public class Diamond {

	public static void main(String[] args) {
      int a=11;int j;
      int temp=a-1;   //7-1=6
      int t=temp/2;     // t=3
      t++;
      for(int i=1;i<=a;i++){       
    	 if(i<=t) {
    		 for(j=t;j>=i;j--) {
    			 if(j>i) {
    				 System.out.print(" ");
    			 }
    			 else {
    				 for(int p=1;p<=i;p++) {
    					 System.out.print("*");
    					 System.out.print(" ");
    				 }
    			 }
    		 }
    	 }

    	 else {
    		 for(int k=t;k<=a;k++) {
    			 if(k<i) {
    				 System.out.print(" ");
    			 }
    			 else {
    				
    					 
    					 System.out.print("*");
    					 System.out.print(" ");
    					 
    			 }
    		 }
    	 }
    		System.out.println();  
      }
      
  	 
	}

}
