package solutions;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountingElements {
	/*
	 * Day - 7
	 *
	 * Given an integer array arr, count element x such that x + 1 is also in arr.
	 * If there're duplicates in arr, count them seperately.
	 * 
	 * Example 1:
	 * 
	 * Input: arr = [1,2,3]
	 * Output: 2
	 * 
	 * Explanation: 1 and 2 are counted cause 2 and 3 are in arr.
	 * 
	 * Example 2:
	 * 
	 * Input: arr = [1,1,3,3,5,5,7,7]
	 * Output: 0
	 * 
	 * Explanation: No numbers are counted, cause there's no 2, 4, 6, or 8 in arr.
	 * 
	 * Example 3:
	 * 
	 * Input: arr = [1,3,2,3,5,0]
	 * Output: 3
	 * 
	 * Explanation: 0, 1 and 2 are counted cause 1, 2 and 3 are in arr.
	 * 
	 * Example 4:
	 * 
	 * Input: arr = [1,1,2,2]
	 * Output: 2
	 * 
	 * Explanation: Two 1s are counted cause 2 is in arr.
	 * 
	 * Constraints:
	 * 		1 <= arr.length <= 1000
	 * 		0 <= arr[i] <= 1000
	 */
	public static void main(String[] args){
		Scanner sca = new Scanner(System.in);
		int size = sca.nextInt();
		int[] arr = new int[size];
		for(int i = 0;i<size;i++){
			arr[i] = sca.nextInt();
		}
		int result = countElements(arr);
		System.out.println(result);
	}
	
	public static int countElements(int[] arr){
		int result=0,currentElement, currentElementCount, nextElementCount;
		Set<Integer> memData = new HashSet<Integer>();
		for(int ele:arr){
			memData.add(ele);
		}
		
		for(int ele:memData){
			currentElementCount =0;
			currentElement = ele;
			nextElementCount = 0;
			for(int arrEle:arr){
				if(arrEle == currentElement){
					currentElementCount++;
					continue;
				}
				if(arrEle + 1 == currentElement){
					nextElementCount++;
					continue;
				}
			}
			if(nextElementCount==0){
				continue;
			}
			if(currentElementCount == nextElementCount){
				result += nextElementCount;
			}else{
				result += currentElementCount;
			}
		}
		return result;
	}
}
