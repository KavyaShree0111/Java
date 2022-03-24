
public class SwapWithoutTemp {

	public static void main(String[] args) {
	String str = "Java";
	String str1 = "Selenium";
	
	//Print before swapping
	System.out.println("Before swap : " +str+ "" +str1);
	
	//Concatenate str, str1 and store in str
	str=str+str1;
	
	//Store initial string str in str1 
	str1=str.substring(0, str.length()-str1.length());
	
	str=str.substring(str1.length());
	 
	//Print after swapping
	System.out.println("After swap : " +str+ "" +str1);

	
	}

}
