/**
 * @author Joshua Crotts
 */

package string3;

public class NotReplace {

	public static void main(String[] args) {
		System.out.println(notReplace("is test")); //is not test
		System.out.println(notReplace("is-is")); //is not-is not
		System.out.println(notReplace("This is right"));//This is not right
		System.out.println(notReplace("This is isabell")); //This is not isabella
		System.out.println(notReplace("")); //""
		System.out.println(notReplace("Dis is bliss is")); //Dis is not bliss is not
		System.out.println(notReplace("is his"));
		System.out.println(notReplace("isis"));
	}
	
	public static String notReplace(String s) {
		String newStr = "";
		
		for(int i = 0; i < s.length(); i++) {
			
			//First we need to see if it's an "is" at ALL.
			if(s.charAt(i) == 'i' && s.charAt(i + 1) == 's') {
				if(s.length() <= 2) {
					newStr += "is not";
					break;
				}
				//Test the far left first
				if(i == 0) {
					//If the character two in front is not a letter, we know it's a good "is"
					if(!Character.isLetter(s.charAt(i + 2))) {
						newStr += "is not";
					}else{
					  newStr += "is";
					}
					//Move this 
					//i++; //Increment i to make sure it's in the right spot on the original string
				}
				
				//String len = 6
				
				//test far right 
				else if(i == s.length() - 2) {
					if(!Character.isLetter(s.charAt(i - 1))) {
						newStr += "is not";
					}else{
					  newStr += "is";
					}
				}
				
				//Middle ground test
				else if(!Character.isLetter(s.charAt(i - 1)) && 
							!Character.isLetter(s.charAt(i + 2))) {
					newStr += "is not";
					
				}else {
					newStr += "is";
				}
				
				i++;
				continue;
			}else {
				newStr += s.charAt(i);
			}
			
		}
		
		return newStr;
		
}


}
