/**
 * @author Joshua Crotts
 */

package string3;

public class EqualIsNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//Brute force approach but works?
	public boolean equalIsNot(String str) {
		int isCount = 0;
		int notCount = 0;

		for(int i = 0; i < str.length() - 1; i++){
			if(str.substring(i, i + 2).equals("is"))
				isCount++;
		}

		for(int j = 0; j < str.length() - 2; j++){
			if(str.substring(j, j + 3).equals("not"))
				notCount++;
		}

		return isCount == notCount;
	}

}
