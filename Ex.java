import java.io.*;
	import java.util.*;
        public class Ex {
        public static void main(String args[])
	    {
	    	Scanner in=new Scanner(System.in);
	        String name;
	        int flg=0;
	        name=in.next();
	        char[] a = name.toCharArray();
	        int l=name.length();
	        for(int i=0;i<l;i++)
	        {
	        	if(a[i]=='.')
	        		{
	         		 flg=1;
	        		 i++;
	        		}
	        	if(flg==1)
	        		System.out.print(a[i]);
	        }
	        if(flg==0)
                 {
                        System.out.println("No Extension");
                  }
	      }
	    }
