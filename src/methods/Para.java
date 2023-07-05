package methods;

public class Para {

	public static void main(String[] args) {
		employ("riddhi", 5, 'f', "9405888174",100000);
		Para em =new Para();
		em.employees(100000, 50000);
		

	}
	
	public static void employ(String name,int id,char gender,String mobileNo,double salary) {
		 System.out.println("Empolyees information :");
		 System.out.println("-----------------------------------");
		 System.out.println("Employees Name :"+name);
		 System.out.println("employees Id :"+id);
		 System.out.println("Employees Gender :"+gender);
		 System.out.println("Employees Mobile No. :"+mobileNo);
		 System.out.println("Employees Salary :"+salary);
	}
	
	public void employees(int salary,int bonus) {
		 int ctc=salary*12+bonus;
		 System.out.println("Employees ctc is :"+ctc);
		
	}

}
