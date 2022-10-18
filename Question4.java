import java.util.Scanner;

// Q4 - Write a ConsoleProgram that reads in a number from the user and then displays the
//Hailstone sequence for that number (Pick some positive integer and call it n. If n is even,
//divide it by two. If n is odd, multiply it by three and add one. Continue this process until n
//is equal to one).
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();  // taking integer input

		while(n!=1){
			System.out.println(n);
			if(n%2==0) n/=2;
			else n = 3*n + 1;

		}

	}

}
