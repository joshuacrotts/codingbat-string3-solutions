/**
 * @author Joshua Crotts
 */

package string3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maxBlock(String str) {
		List<Integer> counts = new ArrayList<Integer>();

		for(int i = 0; i < str.length(); i++){
			int count = 0;

			for(int j = i; j < str.length(); j++){
				if(str.charAt(j) != str.charAt(i))
					break;

				count++;
			}

			counts.add(count);

		}
		Collections.sort(counts);

		return counts.size() >= 1 ? counts.get(counts.size() - 1) : 0;
	}


}
