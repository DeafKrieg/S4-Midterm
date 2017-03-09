
public class IOverloads {
	
	private double field;
	
		//static members
		//overloaded methods
		//(one multiplies two numbers, the other multiplies 3)
	public static double multiply(double n1, double n2){
		return n1 * n2;
	}
	public static double multiply(double n1, double n2, double n3){
		return n1 * n2 * n3;
	}
	
	
		//overloaded constructors
		//(one with arguments for fields, one without)
	public IOverloads(){
		
	}
	public IOverloads(double field) {
		this.field = field; //"this" reference variable
	}

}
