import java.util.*;
public class preetyno
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int prettyNo;
            int L=sc.nextInt();
            int R=sc.nextInt();
            prettyNo=((R/10) - (L/10))*3;
            if(R%10 > 1)
            {
                prettyNo++;
                if(R%10 >= 3)
                {
                    prettyNo++;
                }
                if(R%10 == 9)
                {
                    prettyNo++;
                }
            }
            System.out.println( prettyNo );
        }
    }
}
