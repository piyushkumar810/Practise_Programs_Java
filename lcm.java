
import java.util.*;
public class lcm
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two number to perform lcm");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i;
        for(i=1;i<=(a*b);i++)
        {
            if(i%a==0 && i%b==0)
                break;
        }
        System.out.println("the LCM of two number is= "+i);
    }
}
