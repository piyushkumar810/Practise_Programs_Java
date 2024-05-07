
/* swapping two values  */
import java.util.*;
public class swap_program
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,temp;
        System.out.println("enter value of a and b");
        a=sc.nextInt();
        b=sc.nextInt();

        System.out.println("value of a and b are:");
        System.out.print("a= "+a+ "  ");
        System.out.println("b= "+b);

        temp=a;
        a=b;
        b=temp;

        System.out.println("now after swapping value of a nad b");
        System.out.print("a= "+a+ "  ");
        System.out.print("b= "+b);
    }
}
