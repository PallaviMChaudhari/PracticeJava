package practiceproj;

public class PractPaper {

	public static void main(String[] args) {
		int a=10;
		if(a%2==0){
		System.out.println("number is even");
		}
		else{
		System.out.println("number id odd");
		}
		System.out.println("=================================================");
		int b=-10;
		if(b>0){
		System.out.println("number is grater than zero");
		}
		else if(b<0){
		System.out.println("number is less than zero");
		}
		else{
		System.out.println("number is zero");
		}
		System.out.println("=============================================");
		char gender='m';
		if(gender =='m'){
		System.out.println("you are male");
		}
		else{
		System.out.println("you are female");
		}
		
		System.out.println("=======================================");
		int age =26;
		if(age>=18){
		System.out.println("u r eligible for voting");
		if(age>=21){
		System.out.println("u r eligible for voting as well as marriage ");
		}
		else{
		System.out.println("u r eligible for voting but not for marriage");
		}
		}
		else{
		System.out.println("u rnot eligible for voting");
		}
		
		System.out.println("======================================");
		
		String season="rainy";

		switch(season){
		case "rainy":System.out.println("Rainy Season");break;

		case "summer":System.out.println("Summer Season");break;

		case "winter":System.out.println("winter is coming");break;

		default:System.out.println("enter valid season value");
		}
		
		System.out.println("============================");
		
		char gen='f';
		switch(gen){
		case 'm':System.out.println("u r male"); break;

		case 'f':System.out.println("u r female"); break;

		case 'o':System.out.println("u r other"); break;

		 
		default:System.out.println("u r not human");
		 
		 
		}
		
		System.out.println("===============================");

        for(int i=1;i<=5;i++){
              for(int j=1;j<=i;j++){
                     System.out.print(i+" ");

              }
              System.out.println();
        }
        System.out.println("================================");
        
        int i=1;
        while(i<=10){
        System.out.println(i);
        i++;
        }
        System.out.println("=================================");
       
      
        int j=11;
        do{
        System.out.println(j);
        j++;
        }while(j<=20);
        
        System.out.println("===================================");
        
        







	}

	

}
