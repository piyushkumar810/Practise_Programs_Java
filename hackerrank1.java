
//  Q)
// Given an array of integers, calculate the ratios of its elements that are
//  positive, negative, and zero. Print the decimal value of each fraction
//  on a new line with  places after the decimal.
//
//   Note: This challenge introduces precision problems.
//         The test cases are scaled to six decimal places,
//         though answers with absolute error of up to  are acceptable.


import java.text.DecimalFormat;
import java.util.Scanner;

public class hackerrank1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N=Integer.parseInt(sc.nextLine());
        int arr[]= new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        double positive=0;
        double negative=0;
        double zero=0;
        for(int i=0;i<N;i++)
        {
            if(arr[i]>0)
            {
                positive=positive+1;
            }
            else if(arr[i]<0)
            {
                negative=negative+1;
            }
            else
            {
                zero=zero+1;
            }
        }
        DecimalFormat df= new DecimalFormat("0.000000");
        System.out.println(df.format(positive/N));
        System.out.println(df.format(negative/N));
        System.out.println(df.format(zero/N));
    }
}

