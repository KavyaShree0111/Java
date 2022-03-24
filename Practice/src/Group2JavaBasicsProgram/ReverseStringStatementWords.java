package Group2JavaBasicsProgram;

public class ReverseStringStatementWords {

	public static void main(String[] args) {
		String s = "welcome to india's welcome to mandya";
		String[] str = s.split(" ");
		for (int i = str.length-1; i >= 0; i--) {
		System.out.print(str[i]+ " ");
		}

	}

}
