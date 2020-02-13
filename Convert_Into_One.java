import java.util.Scanner;

// Convert a given number to 1 in the minimum steps you can perform following steps
/*
 *  n = n-1
 *  n = n%2
 *  n = n%3
 */

public class Convert_Into_One
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Convert_Into_One obj = new Convert_Into_One();
		
		System.out.println(obj.find(n));
			
	}
	
	int find(int n)
	{
		if(n<=1)
			return 0;
		
		int ans = find(n-1);
		
		if(n%2 == 0)
			ans = Math.min(ans, find(n/2));
		
		if(n%3 == 0)
			ans = Math.min(ans, find(n/3));
		
		return ans+1;
	}
}