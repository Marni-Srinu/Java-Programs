/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int t,n,x[];
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		
		while(t-- >0)
		{
		    n=sc.nextInt();
		    x=new int[n];
		HashMap<Integer,Integer> h1=new HashMap<>();
		    for(int i=0;i<n;i++)
		      x[i]=sc.nextInt();
		    for(int i=0;i<n;i++)
		    {
		        if(h1.containsKey(x[i]))
		            h1.put(x[i],(int)h1.get(x[i])+1);
		        else 
		            h1.put(x[i],1);
		    }
		    long count=0;
		    for(Map.Entry e:h1.entrySet())
		    {
		       int p=(int)e.getValue();
		       if(p>1)
		          count+=((long)p*(p-1))/2;
		          
		    }
		    System.out.println(count);
		    
		}
	}
}
