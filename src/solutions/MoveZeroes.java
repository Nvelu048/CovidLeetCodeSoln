package solutions;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroes {
	/*
	 * Day - 4
	 * Given an array nums, write a function to move all 0's to the end of it 
	 * while maintaining the relative order of the non-zero elements.
	 * 
	 * Example:
	 * 
	 * Input: [0,1,0,3,12]
	 * Output: [1,3,12,0,0]
	 * 
	 * Note:You must do this in-place without making a copy of the array.
	 * Minimize the total number of operations.
	 */
	public static void main(String[] args){
		Scanner sca = new Scanner(System.in);
		int size = sca.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++){
			arr[i] = sca.nextInt();
		}
		moveZeroes(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void moveZeroes(int[] arr){
		int i=0,j=0;
		
		while(j<arr.length){
			if(arr[j]!=0){
				arr[i++]=arr[j];
			}
			j++;
		}
		while(i<arr.length){
			arr[i++]=0;
		}
	}
}
