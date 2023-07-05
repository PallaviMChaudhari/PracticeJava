package practiceproj;

public class Cons {
	int a,b,c;
	public Cons(){
	 a=10;b=20;

	}

	public Cons(int x,int y){

	a=x;
	b=y;

	}

	public Cons(int x,int y,int z){

	a=x;
	b=y;
	c=z;

	}

	public static void main(String[] args){
	Cons c=new Cons();
	c.add();
	Cons a=new Cons(10,20,40);
	a.add();
	Cons b=new Cons(20,30);
	b.add();

	}

	public void add(){
	 int sum = a+b+c;
	 System.out.println("Addition :"+sum);
	}


}
