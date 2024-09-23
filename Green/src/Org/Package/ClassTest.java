package Org.Package;
import java.util.*;
public class ClassTest {
	public static void main(String st[]) {
	Scanner scan=new Scanner(System.in);
	    int rs=scan.nextInt();
	    int cs=scan.nextInt();
	    int a[][]=new int[rs][cs];
	    for(int i=0;i<rs;i++)
	    {   for(int j=0;j<cs;j++)
	        {   a[i][j]=scan.nextInt();}
	    }
	    int fd=0;
	    for(int i=0;i<rs;i++)
	    {   for(int j=0;j<cs;j++)
	        {
	    	    if(i==j)
	    	    {  fd=fd+a[i][j];  }
	    	    
	        }
	    }
	    System.out.println("BD="+fd);
	}

}
