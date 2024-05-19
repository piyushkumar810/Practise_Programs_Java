import java.util.Scanner;

public class array_greatest_no
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int g,s;
        System.out.println("enter the size of array");
        s=sc.nextInt();
        int arr[]=new int[s];
        System.out.println("Enter the value of array");
        for(int i=0; i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
//        System.out.println("the greatest value is");
        for(int i=0; i<arr.length;i++)
        {
            g=arr[0];
            if(g<arr[i+1]) {
                g = arr[i + 1];
                System.out.println("the greatest value is " + g);
            }
        }
    }
}
