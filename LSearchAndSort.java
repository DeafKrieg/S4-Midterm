
public class LSearchAndSort {

	static void sequentialSearch(int[] nums, int query){
		for(int x = 0; x < nums.length; x++){
			if(nums[x] == query){
				System.out.println("Number " + query + " found at position " + x);
			}
		}
	}
	
	public static void main(String[] args) {
		
			//array to be searched
		int[] nums = new int[] {9, 10, 5, 84, 12, 4, 8, 65, 13, 24, 62, 48, 52, 1, 13};
			//number to be searched for
		int query = 13;
			//perform search
			//this will find number 13 at positions 8 and 14
		sequentialSearch(nums, query);
		
	}

}
