/**
 * @author Joshua Crotts
 */

package string3;

public class GHappy {

	public static void main(String[] args) {

	}
	public boolean gHappy(String str) {
		if(str.length() < 2){
			if(str.length() == 0)
				return true;
			return false;
		}
		if(str.charAt(str.length() - 1) == 'g' && str.charAt(str.length() - 2) != 'g'){
			return false;
		}

		for(int i = 1; i < str.length() - 1; i++){
			if(str.charAt(i) == 'g' && (str.charAt(i + 1) != 'g' && str.charAt(i - 1) != 'g')){
				return false;
			}
		}

		return true;
	}

}
