import java.util.ArrayList;

public class KArray {

	public static void main(String[] args) {

			//array of five ints
		int[] nums = new int[] {5, 10, 15, 20, 25};
			//print whole array
		for(int x = 0; x < nums.length; x++){
			System.out.println(nums[x]);
		}
		
			//create Arraylist
		ArrayList nums2 = new ArrayList();
		
			//add things to arraylist
		nums2.add(10);
		nums2.add(20);
		nums2.add(30);
		
		for(int x = 0; x < nums2.size(); x++){
			System.out.println(nums2.get(x));
		}
	}

}
