
import java.util.*;
public class codechef2
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int f=1;
            int n=sc.nextInt();
            if(n>=1 && n<=100)
                while(n!=0)
                {
                    f=f*n;
                    n--;
                }
            System.out.println(f);
        }
    }
}
