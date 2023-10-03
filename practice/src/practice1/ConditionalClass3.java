package practice1;

/* public class StringWord {
	public static void main(String arg[]) // write a new function thats takes one string argument and returns the same string prefixed with another string - Hello
	{
		String Result = word("kate");
		System.out.println(Result);
	}

	public static String word(String s1) {
		String s2 = ("hello" +" "+ s1  );
		return s2;
	}
}*/

/*public class ConditionalClass2 {// Number write a new function takes one number parameter.if number is less than
								// 18 , then it should print " good day" otherwise it should print "Good
								// evening"
	public static void main(String args[]) {
		String  Result = day(18);
		System.out.println(Result);
	}

	public static String day(int a) {
		if (a < 18) {
			//String S1 =  ("Good day");
return "Good day";
		} else {
			//String S2 =  ("Good evening");
return "good evening ";
		}
		
	}

}*/



public class ConditionalClass3 {
	public static void main(String Args[]) {
		String Result = timing(12);
		System.out.println(Result);
	}

	public static String timing(int a) {
		if (a<12) {
			return "Good morning";
		}else if (a >=12 && a< 18 ) {
			return "Good Afternoon";
		}
			else {
				return " Good Evening";
		}
	}
}

