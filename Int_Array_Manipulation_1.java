
import java.util.*;

// Reverse K elements from the last in array..

public class Int_Array_Manipulation_1
{
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();                                                     // 9      Size of array
		 
		 int arr[] = new int[n];                       
		 
		 for(int i=0;i<n;i++)
		 {
			 arr[i] = sc.nextInt();                                    // 12 43 5 6 7 2 3 9 4     Elements of array
		 }
		 
		 int k = sc.nextInt();                                                  // 4  Elements from last to reverse
		 
		 Int_Array_Manipulation_1 obj = new Int_Array_Manipulation_1();
		 
		 int arr2[] = obj.convert(arr,n,k);
		 
		 for(int i=0;i<n;i++)
		 {
			 System.out.print(arr2[i]+" ");
		 }
	}
	
	int[] convert(int arr[], int n, int k)
	{
		
		
		int arr2[] = new int [k];
		
		int x = n-1;                                    
		
		for(int i=0;i<k;i++)
		{
			arr2[i] = arr[x];                        // 4 9 3 2  
			x--;
		}
		
		int y = 0;
		for(int i=n-k;i<n;i++)
		{
			arr[i] = arr2[y];                       // 12 43 5 6 7 4 9 3 2
			y++;
		}
		
		return arr;
	}

}
