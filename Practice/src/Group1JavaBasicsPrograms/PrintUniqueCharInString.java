package Group1JavaBasicsPrograms;

import java.util.HashSet;

public class PrintUniqueCharInString {

	public static void main(String[] args) {
		
			String s = "encapsulation";
			
			System.out.println(s);
			HashSet<Character> set = new HashSet<Character>();
			
			//Step1 : Store each character of a given string
			for (int i = 0; i < s.length(); i++) {
				set.add(s.charAt(i));
			}
			
					
			//Step2 compare each character of the set
			for(Character ch:set) {
				int count=0;
				for (int i = 0; i < s.length(); i++) {
					if(ch==s.charAt(i))
					{
						//step3
						count++; 
					}
				}
				
				//Step4
				if(count==1) {
					System.out.println(ch+ " " +count+ " is the unique of given string");
				}
				
			}

	}

}
