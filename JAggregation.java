
public class JAggregation {

		//fields, including aggregated JAddress field
	private double num;
	private JAddress address;
	
	
		//override toString method
	public String toString(){
		String s = "";
		s += "Number: " + num + "\n" +
			 "Address: " + address;
		return s;
	}
	
	
		//override equals method
	public boolean equals(JAggregation in){ //accept other object as argument
		if(this.num == in.num) return true;	//compare num fields to determine if true or false
		else return false;
	}
	
	public JAggregation(double num, String address) {
		this.num = num;
		this.address = new JAddress(address);
	}

}
