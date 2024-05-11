
import java.util.*;
public class codechef6
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=1;i<=T;i++)
        {
            int N=sc.nextInt();
            int M=sc.nextInt();
            if(N>=0 && M<=100)
            {
                int s=(N*5)+(M*7);
                System.out.println(+s);
            }
        }
    }
}
