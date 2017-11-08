/**
 * @author Joshua Crotts
 */

package string3;

public class CountTriple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//It's a miracle this works
	public int countTriple(String str) {
		int triples = 0;
		for(int i = 0; i< str.length(); i++){
			boolean isTriple = false;

			for(int j = (i + 1); j < str.length() && j <= (i + 3); j++){
				if(str.charAt(j) != str.charAt(i)){
					break;
				}

				if(j == (i + 2)){
					isTriple = true;
					j = i;
					break;
				}
			}

			if(isTriple)
				triples++;

		}

		return triples;
	}


}
