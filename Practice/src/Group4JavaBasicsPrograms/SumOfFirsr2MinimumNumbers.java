package Group4JavaBasicsPrograms;

public class SumOfFirsr2MinimumNumbers {

	public static void main(String[] args) {
int[] arr1= {20, 30, 50, 10, 40};
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i+1; j < arr1.length; j++) {
				if(arr1[i]<arr1[j]) {
					int temp = arr1[i];
					arr1[i]= arr1[j];
					arr1[j]=temp;
				}
				
			} 
		}
		 int sum=0;
		 for (int i = 0; i < 3; i++) {
			 sum=sum+arr1[i];
		 }
			System.out.println("Sum of first 3 Minimum elements = " +sum);
	}

}
