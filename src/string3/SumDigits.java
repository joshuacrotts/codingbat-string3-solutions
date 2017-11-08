/**
 * @author Joshua Crotts
 */

//Fully working

package string3;

import java.util.Stack;

public class SumDigits {

	public static void main(String[] args) {
		System.out.println(sumDigits("aa1bc2d3"));// → 6
		System.out.println(sumDigits("aa11b33"));// → 8
		System.out.println(sumDigits("Chocolate"));//
	}
	
	public static int sumDigits(String s) {
		Stack<Integer> nums = new Stack<Integer>();
		
		for(int i = 0; i < s.length(); i++) {
			if(Character.isDigit(s.charAt(i))){
				nums.push(Integer.parseInt(Character.toString(s.charAt(i))));
			}
		}
		int sum = 0;
		for(Integer x : nums) {
			sum += x;
		}
		
		return sum;
	}
}
