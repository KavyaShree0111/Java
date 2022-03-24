package Group1JavaBasicsPrograms;

import java.util.LinkedHashSet;

public class PrintUnqiueCharInOrderInString {

	public static void main(String[] args) {
		String s = "hello";
		
		System.out.println("input = " + s);
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
			
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
				System.out.print(ch);
			}
			
		}

	}

}
