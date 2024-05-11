
import java.util.*;
public class codechef1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] p=new int[4];
        int i,count=0;
        for(i=0;i<4;i++)
        {
            p[i]=sc.nextInt();
        }
        for(i=0;i<4;i++)
        {
            if(p[i]>=10)
            {
                count++;
            }
        }
        System.out.println(+count);
    }
}
