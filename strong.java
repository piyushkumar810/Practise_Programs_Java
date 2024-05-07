import java.util.Scanner;

public class strong
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number you want");
        int n=sc.nextInt();
        int k=n;//k will store value of n
        int sum=0,product=1,rem;
        while(n!=0)
        {
            rem=n%10;
            n=n/10;
            sum=sum+rem;
            product=product*rem;
        }
                System.out.println("this is sum of input number "+sum);
                System.out.println("this is product of input number "+product);

                //now adding sum and product

                int match=sum+product;
                System.out.println("this is the sum of sum and product "+match);

                //matching is input number is equal to match
                System.out.println();
                System.out.println("________________________________");
                if(match==k)
                {
                System.out.println("Yes "+k+" is special number");
                }
                else
                {
                System.out.println("No "+k+" is not special number");
                }
    }
}






























//
