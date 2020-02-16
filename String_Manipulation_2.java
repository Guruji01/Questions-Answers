package Practice;



// Print duplicate words of the string

import java.util.*;

public class String_Manipulation_2 
{
	public static void main(String[] args)
	{
		String_Manipulation_2 obj = new String_Manipulation_2();
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		obj.check(s);
	}
	
	
	void check(String s)
	{
		String[] str = s.split(" ");
		
		HashMap<String,Integer> hm = new HashMap<>();
		
		for(String tempstring : str)
		{
			if(hm.get(tempstring) != null)
			{
				hm.put(tempstring, hm.get(tempstring)+1);
			}
			
			else
			{
			hm.put(tempstring, 1);
			}
		}
		
		
	   Iterator<String> tempstring = hm.keySet().iterator();
	   
	   while(tempstring.hasNext())
	   {
		 String temp = tempstring.next();
		 
		 if(hm.get(temp)>1)
		 {
			 System.out.println("The word "+ temp +" appear "+
		     hm.get(temp)+" times");
		 }
	   }	
	}
}
