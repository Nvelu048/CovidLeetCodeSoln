package solutions;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class HappyNumber {
	/* 
	 * Day - 2
	 * 
	 * Write an algorithm to determine if a number is "happy".
	 * 
	 * A happy number is a number defined by the following process: 
	 * 	Starting with any positive integer, replace the number by the sum of 
	 * the squares of its digits, and repeat the process until the number equals 1 
	 * (where it will stay), or it loops endlessly in a cycle which does not include 1. 
	 * Those numbers for which this process ends in 1 are happy numbers.
	 * 
	 * Example:
	 * 
	 * Input: 19
	 * Output: true 
	 * 
	 * Explanation: 
	 * 
	 * 1^2 + 9^2 = 82
	 * 8^2 + 2^2 = 68
	 * 6^2 + 8^2 = 100
	 * 1^2 + 0^2 + 0^2 = 1
	 * 
	 */
	public static void main(String[] args){
		Scanner sca = new Scanner(System.in);
		int num = sca.nextInt();
		boolean result = isHappy(num);
		System.out.println(result);
	}
	
	public static boolean isHappy(int num){
		Set<Integer> seenValues = new HashSet<Integer>();
		while(num!=1){
			int currentValue = num;
			int squaredSum = 0;
			while(currentValue > 0){
				squaredSum += (currentValue%10)*(currentValue%10);
				currentValue /= 10;
			}
			if(seenValues.contains(squaredSum)){
				return false;
			}
			seenValues.add(squaredSum);
			num = squaredSum;
		}
		return true;
	}
}
