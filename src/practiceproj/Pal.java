 package practiceproj;

import java.util.*;

public class Pal {

	public static void main(String[] args) {
	      String str1 = "abcd";
	      String str2 = "abcd";
	      System.out.println(str1.endsWith(str2));
	      if(str1.endsWith(str2)) {
	    	  System.out.println("string is equal");
	      }
	      else {
	    	  System.out.println("string is not equal");
	      }
	     
	      Scanner str = new Scanner(System.in);
	      System.out.println("enter the String 1 : ");
	      String str3 =str.nextLine();
	      System.out.println("enter the String 2 : ");
	      String str4 =str.nextLine();
	      if(str3.equalsIgnoreCase(str4)) {
	    	  System.out.println("String is equal");
	    	  
	      }
	      else {
	    	  System.out.println("Not equal");
	      }
      str.close();
	}

}
