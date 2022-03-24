package Group3JavaBasicsPrograms;

public class SumOfEachDigitInGivenString {

	public static void main(String[] args) {
		String s = "a1b2@c3";
		int sum=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				int num=s.charAt(i)-48;
				sum=sum+num;
			}
		}
         System.out.println(sum);
	}

}
 