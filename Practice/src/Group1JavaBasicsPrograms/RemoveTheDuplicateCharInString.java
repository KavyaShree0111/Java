package Group1JavaBasicsPrograms;

import java.util.LinkedHashSet;

public class RemoveTheDuplicateCharInString {

	public static void main(String[] args) {
        String s1 = "hello";
        String s2="afternoon";
        
		String s=s1+s2;
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		
		
			for(Character ch:set) {
				System.out.print(ch);
			}
	}

	}


