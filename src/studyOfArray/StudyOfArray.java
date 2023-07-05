package studyOfArray;

import java.util.Arrays;

public class StudyOfArray {

	public static void main(String[] args) {
		int StdId[]=new int[5];
		StdId[0]=101;
		StdId[1]=102;
		StdId[2]=105;
		StdId[3]=103;
		StdId[4]=106;
		
		System.out.println(StdId[0]);
		System.out.println(StdId[1]);
		System.out.println(StdId[2]);
		System.out.println(StdId[3]);
		System.out.println(StdId[4]);
		
		System.out.println("==============================");
		
		for(int i=0;i<=StdId.length-1;i++) {
			System.out.println(StdId[i]);
		}
		
		Arrays.sort(StdId);
		
		System.out.println("===============sort Array=============");
		for(int i=0;i<=StdId.length-1;i++) {
			System.out.println(StdId[i]);
		}
		
		System.out.println("==============wihtout new keyword================");
		
		int EmpId[]= {1,2,3,4,5};
		for(int i=0;i<=EmpId.length-1;i++) {
			System.out.println(EmpId[i]);
		}
		
		System.out.println("======================================");
		
		String name[]=new String[6];
		name[0]="Pallavi";
		name[1]="Vishal";
		name[2]="Ruchira";
		name[3]="Shweta";
		name[4]="Moksh";
		name[5]="Shreyas";
		
		for(int i=0;i<=name.length-1;i++) {
			System.out.println(name[i]);
		}
		
		System.out.println("==================================");
		
	    Arrays.sort(name);
	    
	    for(int i=0;i<=name.length-1;i++) {
			System.out.println(name[i]);
		}
	    
	    System.out.println("===================================");
		
		int matrix[][]=new int[3][3];
		matrix[0][0]=1;
		matrix[0][1]=2;
		matrix[0][2]=3;
		matrix[1][0]=4;
		matrix[1][1]=5;
		matrix[1][2]=6;
		matrix[2][0]=7;
		matrix[2][1]=8;
		matrix[2][2]=9;
		
		for (int i=0;i<=2;i++) {       
			for(int j=0;j<=2;j++) {      
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("==========================");
		
		char div[][]= {{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'}};
		
		for(int p=0;p<=3;p++) {
			for(int q=0;q<=2;q++) {
				System.out.print(div[p][q]+" ");
			}
			System.out.println();
		}
		
		
		

	}

}
