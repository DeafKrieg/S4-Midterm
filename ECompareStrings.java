
public class ECompareStrings {

	public static void main(String[] args) {
		
		String str1 = "Swoop";
		String str2 = "swoop";
		
			//this is false
		if(str1.equals(str2)) System.out.println("The strings are equal.");
			else System.out.println("The strings are not equal.");
		
			//this is true
		if(str1.equalsIgnoreCase(str2)) System.out.println("The strings are equal.");
			else System.out.println("The strings are not equal.");
		
	}

}
