import java.util.*;
class nom
{
    public static void main(String arg[])
    {
        Scanner ob=new Scanner (System.in);
        int n=ob.nextInt();
        if(n>=0&&n<=9)
        
        {
            switch(n)
            {
                case 0:
                System.out.print("ZEro");
                break;
                case 1:
                System.out.print("One");
                break;
                case 2:
                System.out.print("Two");
                break;
                case 3:
                System.out.print("Three");
                break;
                case 4:
                System.out.print("Four");
                break;
                case 5:
                System.out.print("five");
                break;
                case 6:
                System.out.print("six");
                break;
                case 7:
                System.out.print("seven");
                break;
                case 8:
                System.out.print("egiht");
                break;
                case 9:
                System.out.print("nine");
                break;
                default:
                System.out.print("valid data");
                
            }
            
               
        }
    }
}
