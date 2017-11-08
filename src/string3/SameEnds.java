/**
 * @author Joshua Crotts
 */

package string3;

public class SameEnds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String sameEnds(String string) {
		String longest = "";

		for(int i = 1; i < string.length() / 2 + 1; i++){
			if(string.endsWith(string.substring(0, i))){
				longest = string.substring(0, i);
			}
		}

		return longest;
	}


}
