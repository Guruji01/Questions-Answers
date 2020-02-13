
import java.util.*;

 // Reverse character and numbers in string but not special character.. 


public class String_Manipulation_1
{
	public static void main(String[] args)
	{

		 Scanner sc = new Scanner(System.in);
		 String s = sc.nextLine();
		 
		 String_Manipulation_1 obj = new String_Manipulation();
		 
		 String k = obj.convert(s);
		 
		 System.out.println(k+" ");
	}
	
	String convert(String s)                           // if s = 12as#$r#
	{
		String ans = "";

		
		char ch[] = s.toCharArray();               // ch[] = {'1','2','a','s','#','$','r','#'}
		int n = s.length();                            // 8
		
		for(int i=0;i<n;i++)
		{
		   if(Character.isLetterOrDigit(ch[i]))
	                  {
	                      ans = ans+ch[i];                       // 12asr
		    }
		}
		
		char ch2[] = ans.toCharArray();              // ch2[] = {'1','2','a','s','r'}
		int n2 = ch2.length;  
		
	             ans = "";
		
		int x = n2-1;
		for(int i=0;i<n;i++)
		{
		    if(Character.isLetterOrDigit(ch[i]))
		      {
	                       ch[i] = ch2[x];
	                       x--;
		       }
			ans = ans+ch[i];
		}
		
		return ans;
	}
}
