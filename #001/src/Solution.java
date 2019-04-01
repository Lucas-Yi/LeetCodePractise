import java.util.HashMap;
import java.util.Map;

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
    
    public static int[] twoSum2(int[] nums, int target) {
    	Map<Integer, Integer> hashMap = new HashMap<>();
    	for(int i = 0; i < nums.length; i++) {
    		int complement = target - nums[i];
    		if(hashMap.containsKey(complement)) {
    			return new int[] {hashMap.get(complement), i};
    		}
    		hashMap.put(nums[i], i);
    	}
    	throw new IllegalArgumentException("No two sum solution");
    }
    
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2, 7, 11, 15};
		int target = 18;
		int[] answer = twoSum2(nums, target);
		System.out.print(answer[0]);
		System.out.print(answer[1]);
	}
}