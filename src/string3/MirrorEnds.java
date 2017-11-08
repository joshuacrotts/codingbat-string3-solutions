/**
 * @author Joshua Crotts
 */

package string3;

public class MirrorEnds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String mirrorEnds(String string) {
		String longest = "";

		for(int i = 1; i < string.length() + 1; i++){
			if(string.endsWith(new StringBuffer(string.substring(0, i)).reverse().toString())){
				longest = string.substring(0, i);
			}
		}

		return longest;

	}


}
