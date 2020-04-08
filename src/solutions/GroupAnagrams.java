package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class GroupAnagrams {
	/*
	 * Day - 6
	 * 
	 * Given an array of strings, group anagrams together.
	 * 
	 * Example:
	 * 
	 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
	 * Output: [
	 *   ["ate","eat","tea"],
	 *   ["nat","tan"],
	 *   ["bat"]
	 *   ]
	 *   
	 * Note:
	 * 
	 * All inputs will be in lowercase.
	 * The order of your output does not matter.
	 */
	public static void main(String[] args){
		Scanner sca = new Scanner(System.in);
		int size = sca.nextInt();
		String[] strs = new String[size];
		for(int i=0;i<size;i++){
			strs[i] = sca.next();
		}
		List<List<String>> groupedAnagrams = groupAnagrams(strs);
		System.out.println(groupedAnagrams);
	}
	
	static List<List<String>> groupAnagrams(String[] strs){
		HashMap<String, List<String>> lookUp = new HashMap<String, List<String>>();
		List<List<String>> groupedAnagrams = new ArrayList<>();
		for(String str:strs){
			char[] sortedChar = str.toCharArray();
			Arrays.sort(sortedChar);
			String sortedString = new String(sortedChar);
			if(!lookUp.containsKey(sortedString)){
				lookUp.put(sortedString, new ArrayList<String>());
			}
			lookUp.get(sortedString).add(str);
		}
		groupedAnagrams.addAll(lookUp.values());
		return groupedAnagrams;
	}
}
