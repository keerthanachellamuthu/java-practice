package practice1; // write a new method thats takes a number as argument and return true if it is odd or false

public class ConditionalExample {
	public static void main(String arg[]) {
		boolean result = even(5);
		System.out.println(result);
	}

	public static boolean even(int a ) {
		if (a%2 ==0){
		return true;
		}
		else {
		return false;
		}
		
	}
}
