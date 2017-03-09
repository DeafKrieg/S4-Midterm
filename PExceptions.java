import java.util.Scanner;

public class PExceptions {

	public static class NegativeInputException extends Exception{
		public NegativeInputException(){
			super("Error: No Negative Numbers");
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		
		int num = 0;
		
		try{
				//accept user input
			int input = in.nextInt();
				//if input is negative, throw an exception
			if(input < 0) throw new NegativeInputException();
				//if exception is not thrown, continue as normal
			num = input;
		}
			//the catch block will handle such an exception
		catch (NegativeInputException e){
			System.out.println(e.getMessage());
		}
			//this catch block will handle any other exception if the first block
			//does not fire
		catch (Exception e){
			System.out.println(e.getMessage());
		}
			//finally block executes no matter what
		finally{
			System.out.println(num);
		}
		
		in.close();
	}

}
