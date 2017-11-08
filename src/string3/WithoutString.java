/**
 * @author Joshua Crotts
 */

package string3;

public class WithoutString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String withoutString(String base, String remove) {
		return base.replaceAll("(?i)"+remove, "");
	}


}
