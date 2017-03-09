
public class CIf {

	public static void main(String[] args) {

		double num1 = 1;
		double num2 = 1;
		double num3 = 10;
		double num4 = 20;
		
			//if
		if(num1 == num2){
			System.out.println("The first and second numbers are equal.");
		}
		
			//if else
		if(num2 < num3){
			System.out.println("The second number is less than the third.");
		} else{
			System.out.println("The second number is not less than the third.");
		}
			// if else if
		if(num2 < num3){
			System.out.println("The second number is less than the third.");
		} else if(num2 > num3){
			System.out.println("The second number is greater than the third.");
		} else{
			System.out.println("The second number is equal to the third.");
		}
		
	}

}
