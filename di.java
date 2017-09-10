import java.io.*;
import java.util.*;
class di
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char ch=str.charAt(0);
        if(ch>='0' && ch<='9')
        {
            System.out.println(" TRUE");
        }
        else
        {
             System.out.println(" FALSE");
        }
    }
}
