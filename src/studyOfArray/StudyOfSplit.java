package studyOfArray;

public class StudyOfSplit {

	public static void main(String[] args) {
		String str="my #: name #: is #: pallavi #: manilal #: chaudhari";
		String str1="#:";
		String a[]=str.split(str1);
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
			
		}
		
			 
	}
		
}


