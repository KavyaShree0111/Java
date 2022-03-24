
public class PrimeNoOrNot {

	public static void main(String[] args) {
		//int num=7
		int num=7;
		int i=2;
		int count = 0;
		
		while(i<=num) {
			if(num%i==0) { //7%2==0//rem=1 condition fails
				break;
			}
			else {
				//i++;  
				count++;
			}
		 }
		if(num==count) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not Prime Number");
		}
		
	}
	}


