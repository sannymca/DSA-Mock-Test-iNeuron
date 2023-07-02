


//Write a Java program to print the Fibonacci series up to a given number using a for loop.
package Java_mock_Test;
import java.util.*;
public class FibonacciSeries {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int first=0,sec=1,third=0;
		System.out.print(first+",");
		System.out.print(sec+",");
		for(int i=2;i<num;i++)
		{
			third=first+sec;
			System.out.print( third+",");
			first=sec;
			sec=third;
			
		}
	}

}
