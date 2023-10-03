package practice1; // ctrl+swift+F is for formatting

public class MathExamples {
	public static void main(String arg[]) { // JVM starts executing from main method
		int result = add(10, 20);// () is function called operator // calling the method/function in main
									// method// creating the variable to store the value of method
		System.out.println(result);
	}

	public static int add(int a, int b) { // first word of method and variable first word should be lower case and
											// second word or following word can be capital
		int sum = a + b;
		return sum; // since the method is being called and we need to print it in main method we
					// should declare the method as datatype (int) and should declare return keyword
	}

}
