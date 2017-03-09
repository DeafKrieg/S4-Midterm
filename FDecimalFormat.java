import java.text.DecimalFormat;

public class FDecimalFormat {

	public static void main(String[] args) {
		
			//formatter
		DecimalFormat dollar = new DecimalFormat("0.00");
		
		double dollarAmount2 = 100.51010;
		double dollarAmount1 = 2.1;
		
			//will display "$100.50"
		System.out.println("$" + dollar.format(dollarAmount2));
			//will display "$2.10"
		System.out.println("$" + dollar.format(dollarAmount1));
		
		
	}

}
