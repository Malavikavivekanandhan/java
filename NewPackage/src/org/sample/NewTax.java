package org.sample;
import java.util.*;
public class NewTax{
	public static void main(String st[]){
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();   //5
	int arr[]=new int[n];  // 100 1200 300 400 500
	for(int i=0;i<n;i++)
	{   arr[i]=scan.nextInt();   }
	int m1=arr[0];
	for(int i=1;i<n;i++)
	{   if(arr[i]>m1)
	    {  m1=arr[i];  }
	}
	int m2=arr[0];
	for(int i=1;i<n;i++)
	{
		if(arr[i]!=m1)
		{   if(arr[i]>m2)
		    {  m2=arr[i];  }
		}
	}
	System.out.println(m2);	
	}
}


