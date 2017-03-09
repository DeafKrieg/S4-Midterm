import java.util.Scanner;

public class HAccumulatorSentinel {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
			//Accumulator (running total)
		int accumulator = 0;
			//use a for loop to count to ten
		for(int x = 1; x < 10; x++){
				//accumulator gains the value each iteration
			accumulator += x;
		}
			//will display "45"
		System.out.println(accumulator);
		
		
		
		
			//sentinel value (if the user inputs this,
			//the loop will stop.)
		int sentinel = -1;
			//for storing user input
		int input;
		
		do{
				//prompt input
			System.out.println("Input a number to multiply by ten. Input -1 to stop.");
				//store user input
			input = in.nextInt();
				//display result if input is not sentinel value;
			if(input != sentinel) System.out.println("Result: " + (input * 10));
		}while(input != sentinel);//loop ends if input is sentinel value
		
		
		
		in.close();
	}

}
