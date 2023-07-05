package studyOfArray;

public class ArrayStudy {

	public static void main(String[] args) {
		String str1 ="pallavi manilal ";
		String str4 = "chaudhari";         
		char a[]=str1.toCharArray();
		char b[]=new char[a.length];
		for(int i=0;i<=a.length-1;i++) {
			b[i]=a[a.length-1-i];
			
		}
		System.out.println(b);
		String str2=new String(b);
		System.out.println(str2);
		
		StringBuilder str3=new StringBuilder(str2).reverse();
		System.out.println(str3);
		System.out.println(str3.append(str4));
		

	}

}
