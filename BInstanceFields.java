
public class BInstanceFields {

		//fields that store numbers
	private double num1;
	private int num2;
	
	
		//methods that add to fields
	public void incrementNum1(){
		num1++;
	}
	
	public double addNums(){
		return num1 + num2;
	}
	
		//constructor
	public BInstanceFields(double num1, int num2) {
		this.num1 = num1; this.num2 = num2;
	}

}
