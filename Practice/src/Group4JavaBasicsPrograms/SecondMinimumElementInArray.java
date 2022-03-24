package Group4JavaBasicsPrograms;

public class SecondMinimumElementInArray {

	public static void main(String[] args) {
		int[] arr1= {20, 30, 50, 10, 40};
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i+1; j < arr1.length; j++) {
				if(arr1[i]>arr1[j]) {
					int temp = arr1[i];
					arr1[i]= arr1[j];
					arr1[j]=temp;
				}
				
			} 
		}
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]+ " ");
		}
		
		System.out.println();
		System.out.println("minimum element from the array is " + arr1[1]);

	}

}
