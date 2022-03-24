package Group4JavaBasicsPrograms;

public class PrintMaximumLengthStringArray {

	public static void main(String[] args) {
		String[] strarr= {"Welcome", "the", "Java", "Welcome"};
		String maxElement = strarr[0];
		for (int i = 0; i < strarr.length; i++) {
			if (maxElement.length()<strarr[i].length()) {
				maxElement=strarr[i];
			}
		}
		for (int i = 0; i < strarr.length; i++) {
			if (maxElement.length()==strarr[i].length()) {
				maxElement=strarr[i];
				System.out.println(maxElement);
			}
		}	
		}
	}


