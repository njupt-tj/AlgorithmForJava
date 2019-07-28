package com.array;

/**
 * 找到最大连续1的个数
 * @author 汤吉
 *
 */
public class FindMaxConsecutiveOnes {

	
      public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int count=0;
        for(int i=0;i<nums.length;i++) {
        	
        	if (nums[i]==1) {
				count++;
				if (i==nums.length-1) {
					return count>max?count:max;
				}
			}else {
				if (count>max) {
					max=count;
				}
				count=0;
			}
        }
        return max;
        
        
        
        
        
    }
	public static void main(String[] args) {
		int nums[]= {1,1,0,0,1,1,1,1,1,1,0,1,0,0,1,1,1,1,1};
		System.out.println(new FindMaxConsecutiveOnes().findMaxConsecutiveOnes(nums));

	}

}
