//Q3 - Write a program to sort strings (using library function).
import java.util.Arrays;
public class Question3 {
	public static void main(String args[]){

		String str = "cdebufdsfgb"; 

		char []charArr	= str.toCharArray();
		Arrays.sort(charArr);
		str = new String(charArr);

		System.out.println(str);
	}
	
}
