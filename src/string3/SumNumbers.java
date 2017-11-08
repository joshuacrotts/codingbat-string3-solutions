/**
 * @author Joshua Crotts
 */

package string3;

import java.util.Stack;

public class SumNumbers {

	public static void main(String[] args) {
		System.out.println(sumNumbers("a22bbb3"));
	}

	public static int sumNumbers(String str){
		Stack<Integer> nums = new Stack<Integer>();
		String digit = "";

		outer:
			for(int i = 0; i < str.length(); i++){
				//System.err.println("Iteration i-"+i+": "+str.charAt(i));
				//System.err.println("After loop ends, i is: "+i);
				if(Character.isDigit(str.charAt(i))){

					digit += str.charAt(i);
					if(i == str.length()-1){
						nums.push(Integer.parseInt(digit));
						break outer;
					}
					inner:
						for(int j = i + 1; j < str.length() + 1; j++) {
							//System.err.printf("J is now %d, digit is %s, the char at j is %s\n", j, digit, str.charAt(j));
							if(Character.isDigit(str.charAt(j))) {
								//System.err.printf("%s is a digit! Adding to str digit...\n",str.charAt(j));
								digit += str.charAt(j);
								//System.err.printf("Length of digit %s: %d, j is %d\n", digit, digit.length(), j);
								if(digit.length() > 0 && j + 1 == str.length()) {
									//	System.err.println("PUSHING THE DIGIT "+digit);
									nums.push(Integer.parseInt(digit));
									break outer;
								}
							}else {
								//System.err.println("PUSHING THE DIGIT "+digit);
								nums.push(Integer.parseInt(digit));
								digit = "";
								i = j;
								//System.err.println("Before loop ends, i is "+i);
								break;
							}
						}
				}
			}
		int sum = 0;

		for(Integer x : nums){
			//System.out.println(x);
			sum += x;
		}

		return sum;
	}

}
