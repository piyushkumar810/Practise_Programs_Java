
import java.util.*;
public class neonNo
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int temp=n;
        int p=n*n;
        int r,s=0;
        while(p!=0)
        {
            r=p%10;
            p=p/10;
            s=s+r;
        }
        if(temp==s)
        {
            System.out.println("the given number is neon number");
        }
        else
        {
            System.out.println("given number is not a neon number");
        }
    }
}
