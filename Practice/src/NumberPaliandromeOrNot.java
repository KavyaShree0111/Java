
public class NumberPaliandromeOrNot {

	public static void main(String[] args) {
		int n=101;
		int temp=n;
		int rev = 0;
		
		while(temp>0)
		{
			int dig=temp%10;
			rev=rev*10+dig;
			temp=temp/10;
		}
		if(n==rev) {
			System.out.println("Number is Paliandrome");
		}
		else {
			System.out.println("Number is not Paliandrome");
		}

	}

}
