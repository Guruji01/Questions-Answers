import java.util.*;
import java.util.Scanner;  // but not required due to line no. 1

class Naveen
{
	public static void main(String args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();                            // 6

		int arr[] = new int[n];

		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();                 // 0 1 5 8 9 10
		}

		System.out.println(Naveen.Find(arr,n));
	}

	static int Find(int price[], int n)
	{

    int dp[][] = new int [n+1][n+1];


    for(int i=0;i<=n;i++)
    {
    	for(int j=0;j<=n;j++)
    	{

           if(i == 0 || j == 0)
           {
           	dp[i][j] = 0;
           }
           else
           {
           	if(i>j)
           	{
           		dp[i][j] = dp[i-1][j];
           	}
           	else
           	{
           		dp[i][j] = Math.max(price[i-1]+dp[i][j-1],dp[i-1][j]);
           	}
           }

    	}
    }

    return (dp[n][n]);

	}
}
