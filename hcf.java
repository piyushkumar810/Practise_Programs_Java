import java.util.*;

public class hcf
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two value for hcf");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i;
        for(i=a<b?a:b; i>=1; i--)
        {
            if(a%i==0 && b%i==0)
                break;
        }
        System.out.println("the HCF of "+a +" and " +b +" is =" +i);
    }
}
