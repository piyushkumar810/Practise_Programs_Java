
import java.util.*;

public class armstrongNo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two number");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int i,s=0,r;
        for(i=n;i<=m;i++)
        {
            int t=i;
            while(t!=0)
            {
                r=t%10;
                s=s+(r*r*r);
                t=t/10;
            }
            if(t==s)
            {
                System.out.println(s);
            }
        }
    }
}
