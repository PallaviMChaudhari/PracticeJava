package practiceproj;
public class Palindrome {
 
	public static void main(String[] args) {
		
		String str1="abcba";
		char original[]=str1.toCharArray();
		char reverse[]=new char[original.length];

			for(int i=0;i<=original.length-1;i++) {
				reverse[i]=original[original.length-1-i];	
				//System.out.println(reverse[i]);
			}
			
			System.out.println("original str :"+str1);	
			String str2=new String(reverse);
			System.out.println("reverse str :"+str2);
	        System.out.println("is String palindrome ?"+str1.equalsIgnoreCase(str2));
	        System.out.println("=============================");
	        
	        if(str1.equalsIgnoreCase(str2)==true) {
	        	System.out.println("String is palindrome");
	        }
	        else {
	        	System.out.println("String is not palindroome");
	        }
	        System.out.println("==================================");
	        StringBuilder str3=new StringBuilder(str1).reverse();
	        System.out.println(str3);
	        
	        StringBuilder str5=new StringBuilder(str1).append('i');
	        System.out.println(str5);
	        
	        System.out.println("======================");
	        String str6 = "pallavi";
	        String str8 = " chaudhari";
	        StringBuilder str7=new StringBuilder(str6).append(str8);
	        System.out.println(str7);
	        
	        
	 

	}

}
