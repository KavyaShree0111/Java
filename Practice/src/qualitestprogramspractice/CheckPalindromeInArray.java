package qualitestprogramspractice;

import java.util.Iterator;

public class CheckPalindromeInArray {

	public static void main(String[] args) {
		
		int[] arr={22,36,49,77,12,19,96};
		
		for (int i = 0; i < arr.length; i++) {
			int n = arr[i];
			int rev=0;
			
			while(n>0)
			{
				int dig=n%10;
				rev=rev*10+dig;
				n=n/10;
			}
			if(arr[i]==rev) {
				System.out.println(arr[i]);
			}		
			
		}
	}

}
