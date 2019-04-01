import java.util.HashMap;

class Solution {
	
	//Solution 1
    public static int[] twoSum(int[] nums, int target){
        for(int i = 0; i < nums.length; i++) {
        	for(int j = i+1; j<nums.length; j++) {
        		if(nums[i] + nums[j] == target) {
        			return new int[] {i, j};
        		}
        	}
        }
        throw new IllegalArgumentException("No two sum solution");        
    }
    
    
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2, 7, 11, 15};
		int target = 18;
		int[] answer = twoSum(nums, target);
		System.out.print(answer[0]);
		System.out.print(answer[1]);
	}
}