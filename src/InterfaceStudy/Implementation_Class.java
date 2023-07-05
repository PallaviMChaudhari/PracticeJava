package InterfaceStudy;

public class Implementation_Class implements Study_Of_Interface{
	int a=50;
	int b=40;

	public static void main(String[] args) 
	{
		Implementation_Class op=new Implementation_Class();
		op.Add();
		op.substraction();
		op.multiplication();
		op.division();
		
		

	}

	
	public void Add() {
		int a=20;
		int b=10;
		int sum=a+b;
		System.out.println("Addition :"+sum);
		
		System.out.println("===================");
		int sum1=this.a+this.b;
		System.out.println("Addition :"+sum1);
		
		System.out.println("=================");
		int sum2=Study_Of_Interface.p+Study_Of_Interface.q;
		System.out.println("Addition :"+sum2);
		
	}

	@Override
	public void substraction() {
		int sub=a-b;
		System.out.println("substraction :"+sub);
		
		
		
	}

	@Override
	public void multiplication() {
		int mul=a*b;
		System.out.println("multiplication :"+mul);
		
	
		
	}

	@Override
	public void division() {
		int div=a/b;
		System.out.println("division :"+div);
		
		
	}

}
