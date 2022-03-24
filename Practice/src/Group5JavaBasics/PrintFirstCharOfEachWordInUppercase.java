package Group5JavaBasics;

public class PrintFirstCharOfEachWordInUppercase {

	public static void main(String[] args) {
		String str = "welcome to tyss";
		char ch = (char) (str.charAt(0)-32);
		System.out.print(ch);
		for (int i = 1; i < str.length(); i++) {
			if(str.charAt(i)==' ') {
			System.out.print(" "+(char) (str.charAt(i+1)-32));
			i=i+1;
			}
			else {
				System.out.print(str.charAt(i));
			}

	}
}
}
