/**
 * @author Joshua Crotts
 */

//Fully working

package string3;

import java.util.Stack;

public class CountYZ {

	public static void main(String[] args) {
		System.out.println(countYZ("fez day"));
	}
	
	public static int countYZ(String str) {
		  //Find all of the words in the String
		  Stack<String> words = new Stack<String>();
		  String word = "";
		  for(int i = 0; i < str.length(); i++){
			  if(!Character.isAlphabetic(str.charAt(i)) && word.length() > 0) {
				  
				  words.push(word);
				  word = "";
			  }else {
				  word += str.charAt(i);
			  }
		  }
		  words.push(word);
		  
		  int sum = 0;
		  
		  for(String s : words){
		    if(s.endsWith("y") || 
		    		s.endsWith("Y") ||
		    		 s.endsWith("z") ||
		    		  s.endsWith("Z")){
		      sum++;
		    }
		  }
		  
		  return sum;
		}

}
