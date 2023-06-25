import java.util.*;
public class DuplicatesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Array Eelement");
		int size=sc.nextInt();
		System.out.println("Enter element of array");
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Duplicates elements  are:-");
		for(int i=0;i<size-1;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]+" ");
				}
			}
		}
		
	}

}
