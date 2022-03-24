package Group5JavaBasics;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SwapFirsyAndLastWordOfString {

	public static void main(String[] args) {
		String s = "welcome to tyss company";
		String[] arr = s.split(" ");
		//System.out.println(s);
		
		LinkedHashSet<String> set =  new LinkedHashSet<String>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
		
		for (int i = 0; i < arr.length-1; i++) { 
			String temp = arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
			
		}
		

	}


