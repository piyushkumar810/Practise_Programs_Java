
import java.util.*;
public class codechif8
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int coun=0;
            int count=0;
            int n=sc.nextInt();
            String arr[]=new String[n];
            for(int j=0;j<n;j++)

            {
                String ar[]={"START38","LTIME108"};
                arr[j]=sc.next();
               // String ar[]={"START38","LTIME108"};
                //ystem.out.println(ar[0]);
                //System.out.println(ar[j]);
                if(arr[j].equals(ar[0]))
                {
                    coun=coun+1;
                }
                else
                {
                    count=count+1;
                }
            }
            System.out.println(coun+" "+count);
        }
    }
}
