package solutions;
import java.util.Scanner;
public class SingleNumber {
	/* 
	 * Day - 1
	 * 
	 * Given a non-empty array of integers, every element appears twice 
	 * except for one. Find that single one.
	 * Note:
	 *      Your algorithm should have a linear runtime complexity. 
	 *      Could you implement it without using extra memory?
	 * Example 1: 
	 *  Input: [2,2,1]
	 *  Output: 1
	 * Example 2:
	 *  Input: [4,1,2,1,2]
	 *  Output: 4.  
	 */
	public static void main(String[] args){
		Scanner sca = new Scanner(System.in);
		int n = sca.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sca.nextInt();
		}
		int result = getSingleNumber(arr);
		System.out.println(result);
	}
	
	public static int getSingleNumber(int[] arr){
		int value=0;
		for(int i:arr){
			value ^= i;
		}
		return value;
	}
}
