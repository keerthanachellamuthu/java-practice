package practice1;

public class HelloWorld {
	public static void main(String ard[]) { // declaring main method
		// public -access specifier , static - used so we need to use any object , void
		// -return type
		String a = new String("hello World");
		// declaring the class_variable by creating a new object for creating new object
		// by using new keyword
		int b = 10;
		// declaring the primitive datatype so we dont need any object for initiation
		int c = 5;
		int d = b + c;
		// System.out.println(a,b,c,d);// println takes only one string object in arg so
		// we need to convert multiple values into one string object
		System.out.println(new String(a) + new String(" ") + String.valueOf(b) + new String(" ") + String.valueOf(c));
		// or
		System.out.println(new String(a + " " + b + " " + c + " " + d)); // "+" is concatenate
		// or
		System.out.println((a + " " + b + " " + c + " " + d)); // java will create a new object and execute this
		//
		System.out.printf("%s %d %d %d" ,a, b, c, d ).println(); // Printf is method used to print the values and formating
	   
	}

}
