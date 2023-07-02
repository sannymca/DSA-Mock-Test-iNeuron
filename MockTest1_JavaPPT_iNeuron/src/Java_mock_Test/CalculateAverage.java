
//Write a Java program to calculate the average of a list of numbers using a do-while loop.
package Java_mock_Test;

public class CalculateAverage {

	public static void main(String[] args) 
	{
		int age[]= {20,25,30,25,40,60};
		int i=0;
		int len=age.length;
		float sum=0;
		do {
			sum=sum+age[i];
			i++;
		}
		while(i<len);
		float avg=sum/len;
		System.out.println("The average of age = "+avg);

	}

}
