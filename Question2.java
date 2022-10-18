
// Q2 -Write a program to implement counting sort (with input in the range 0 to 20 and input
// can be repeated multiple times)
public class Question2 {
	static int[] countingSort(int []arr){

		int []freq = new int[21];  // stores the count or frequency of each element in the array
		for(int a:arr) freq[a]++;

		int j = 0;
		for(int i=0;i<=20;i++){

			while(freq[i] > 0){
				arr[j] = i;
				j++;
				freq[i]--;
			}
		}

		return arr;
	}

	public static void main(String[] args) {
		
		int []arr = {7,2,9,3,6,5,1};
		arr = countingSort(arr);

		for(int a:arr) System.out.print(a + " ");
		System.out.println();
		
		

	}

}
