package Group3JavaBasicsPrograms;

public class SeperateCharactersOfString {

	public static void main(String[] args) {
		String str = "abc@123$";
		String alphabets="", number="", specialchar="";
		for (int i = 0; i < str.length(); i++) {
			if((str.charAt(i)>='A'&&str.charAt(i)<='Z')||
			  (str.charAt(i)>='a'&&str.charAt(i)<='z')){
				alphabets=alphabets+str.charAt(i);
			}
			else if((str.charAt(i)>='0'&&str.charAt(i)<='9')) {
				number=number+str.charAt(i);
			}
			
			else {
				specialchar=specialchar+str.charAt(i);	
			}
					
		}
		
		System.out.println(alphabets+" "+number+" "+specialchar);



	}

}
