package solutions;
import java.util.Scanner;
public class MaximumSubArray {
	/* Day - 3
	 * 		Given an integer array nums, find the contiguous subarray 
	 * (containing at least one number) which has the largest sum and 
	 * return its sum.
	 * 
	 * Example:
	 * 
	 * Input: [-2,1,-3,4,-1,2,1,-5,4],
	 * Output: 6
	 * Explanation: [4,-1,2,1] has the largest sum = 6.
	 * 
	 * Follow up: 
	 * 		If you have figured out the O(n) solution, 
	 * try coding another solution using the divide and conquer approach, 
	 * which is more subtle.
	 */
	
	public static void main(String[] args){
		Scanner sca = new Scanner(System.in);
		int size = sca.nextInt();
		int[] nums = new int[size];
		for(int i=0;i<size;i++){
			nums[i] = sca.nextInt();
		}
		int maxSum = maxSubArray(nums, 0, nums.length-1);
		System.out.println(maxSum);
	}
	
	public static int maxSubArray(int[] nums, int l, int r){
		if(l==r){
			return nums[l];
		}
		
		int m=(l+r)/2;
		
		return max(maxSubArray(nums, l, m), maxSubArray(nums, m+1, r),midSum(nums, l, m, r));
	}
	
	public static int midSum(int[] nums, int l, int m, int r){
		int left_sum = Integer.MIN_VALUE;
		int right_sum = Integer.MIN_VALUE;
		int sum = 0;
		for(int i=m;i>=l;i--){
			sum += nums[i];
			if(sum > left_sum){
				left_sum = sum;
			}
		}
		sum = 0;
		for(int i=m+1;i<=r;i++){
			sum += nums[i];
			if(sum > right_sum){
				right_sum = sum;
			}
		}
		return right_sum + left_sum;
	}
	
	public static int max(int a, int b){
		return (a>b)?a:b;
	}
	
	public static int max(int a, int b, int c){
		int maxOftwo = max(a, b);
		return (maxOftwo>c)?maxOftwo : c;
	}
}
