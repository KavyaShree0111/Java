package Group2JavaBasicsProgram;

import java.util.HashSet;

public class PrintUniqueWordsInStringStatement {

	public static void main(String[] args) {
		String s = "welcome to india's welcome to mandya";
		String[] str = s.split(" ");
		System.out.println(s);
		
		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < str.length; i++) {
			set.add(str[i]);
		}
			for (String word : set) {
				int count=0;
				for (int i = 0; i < str.length; i++) {
					if(word.equals(str[i])) {
						//Step3
						count++;
					}
					
				}
				
				if(count==1) {
				System.out.println(word+  "  " );
				}
			}

	}

}
