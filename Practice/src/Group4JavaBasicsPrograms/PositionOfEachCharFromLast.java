package Group4JavaBasicsPrograms;

import java.util.HashSet;

public class PositionOfEachCharFromLast {

	public static void main(String[] args) {
		String s = "Tester";
		String str = s.toLowerCase();
		HashSet<Character> set = new HashSet<Character>();
		
		//Step1 : Store each character of a given string
		for (int i = 0; i < str.length(); i++) {
			set.add(s.charAt(i));
		}
		
		//System.out.println(set);
		
		//Step2 compare each character of the set
		for(Character ch:set) {
			for (int i = str.length()-1; i >=0 ; i--) {
				if(ch==str.charAt(i))
				{
					//step3
					System.out.println(ch+ " = " + (i+1));
					break;
				}
			}
			
		}

	}

}
