package Group2JavaBasicsProgram;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordsInStringStatement {

	public static void main(String[] args) {
           String s = "welcome to india's welcome to mandya";
           String[] str = s.split(" ");
   		   System.out.println("input = " + s);
   		   
   		   //Store each word of string in set
		   LinkedHashSet<String> set = new LinkedHashSet<String>();
		   for (int i = 0; i < str.length; i++) {
			set.add(str[i]);
		   }
		
		    //compare each word of set with all words of String array
			for(String word:set) {
				System.out.print(word+ " ");
			}
	}

}
