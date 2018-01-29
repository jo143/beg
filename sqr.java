/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner ob=new Scanner(System.in);
		int x=ob.nextInt();
		int y=ob.nextInt();
		int c=1;
		for(int i=1;i<=y;i++)
		{
			c*=x;
		}
		System.out.println(c);
	}
}
