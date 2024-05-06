public class pattern2
{
    public static void main(String[] args)
    {
        int i,j,k,x=1;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=(2*i-1);j++)
            {
                System.out.println(x+" ");
                if(j<i)
                {
                    x++;
                }
                else {
                    x--;
                }
            }
        }
    }
}
