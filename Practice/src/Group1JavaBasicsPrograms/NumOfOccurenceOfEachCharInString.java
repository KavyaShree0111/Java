package Group1JavaBasicsPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class NumOfOccurenceOfEachCharInString {

	public static void main(String[] args) {
		
		String s = "hello";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		//Step1 : Store each character of a given string
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		
		System.out.println(set);
		
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
			
			System.out.println(ch+ " = " +count);
		}
			
		}
                                                                                                                                                     
	}


