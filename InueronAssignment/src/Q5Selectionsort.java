public class Q5Selectionsort {

  void  sort(int arr[],int size )
	{
		for(int i=0;i<size-1;i++)
		{
			int min_indx=i;
			
			for(int j=i+1;j<i+1;j++)
			{
				if(arr[j]<arr[min_indx])
				{ 
					min_indx=j;
				}
				int temp=arr[min_indx];
				arr[min_indx]=arr[i];
				arr[i]=temp;
			}
		}
	}
	
		 void display(int arr[],int size)
		 {
			 for(int i=0;i<size-1;i++)
			 {
				 System.out.print(arr[i]+" ");
			 }
		 }
	public static void main(String args[])
	{
		Q5Selectionsort obj=new Q5Selectionsort();
		int arr[]= {75,50,71,48,62,78};
		int size=arr.length;
		obj.sort(arr,size);
		obj.display(arr, size);
				
		}
	}