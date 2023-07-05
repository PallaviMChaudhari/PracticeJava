package controlState;

public class Nested {

	public static void main(String[] args) {
		int age=19;
		if(age>=18) {
			System.out.println("you are eligible for voting");
			if(age>=21) {
				System.out.println("you are eligible for voting as well as marriage");
			}
			else {
				System.out.println("you are eligible for voting but not for marriage");
			}
		}
		else {
			System.out.println("you are not eligible for voting");
		}

	}

}
