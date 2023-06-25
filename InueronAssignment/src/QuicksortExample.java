import java.util.Arrays;
 class Quicksort
 {
	 static void swap(int[]arr,int x,int y)
	 {
		 int temp=arr[x];
		 arr[x]=arr[y];
		 arr[y]=temp;
	 }
	 //partitiion method
	 
	 static int  partition(int arr[],int low,int high)
	 {
		 int pivot=arr[high];
		 int x=(low-1);
		 for(int y=low;y<high;y++)
		 {
			 if(arr[y]<=pivot)
			 {
				 x++;
				 swap(arr,x,y);
			 }
		 }
		 
		 int temp=arr[x+1];
		 arr[x+1]=arr[high];
		 arr[high]=temp;
		 
		 return(x+1);
		 
	 }
	 static void quickSort(int arr[],int low,int high)
	 { if(low<high)
	 {
		 int arr_partition=partition(arr,low,high);
		 
		 quickSort(arr,low,arr_partition-1);
		 quickSort(arr,arr_partition+1,high);
		 
		 
	 }
	 }
 }

public class QuicksortExample {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int my_arr[]= {2,3,4,1,7,3,8,6};
		int size=my_arr.length;
		Quicksort.quickSort(my_arr,0,size-1);
		System.out.print("Sorted element are");
		System.out.println((Arrays.toString(my_arr)));

	}

}
