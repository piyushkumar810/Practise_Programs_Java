//import java.util.Scanner;

//public class pattern
//{
//    public static void main(String[] args)
//    {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter no of series you want");
//        int n=sc.nextInt();
//       int i,j,k;
//       for(i=1;i<=n;i++)
//       {
//           for(j=1;j<=(n-i);j++)
//           {
//               System.out.print("  ");
//           }
//           for(k=1;k<=(2*i-1);k++)
//           {
//               System.out.print("* ");
//           }
//           System.out.println();
//       }
//
//    }
//}



//public class pattern
//{
//    public static void main(String[] args)
//    {
//       int i,j,k;
//       for(i=1;i<=5;i++)
//       {
//           for(j=1;j<=(5-i);j++)
//           {
//               System.out.print("  ");
//           }
//           int x=1;
//           for(k=1;k<=(2*i-1);k++)
//           {
//               System.out.print(x+" ");
//               if(k<i)
//               x++;
//               else
//                   x--;
//           }
//           System.out.println();
//       }
//    }
//}




public class pattern {
    public static void main(String[] args)
    {
        int i, j, k;
        for (i = 1; i <= 5; i++)
        {
            for (j = 1; j <= (5 - i); j++)
            {
                System.out.print("  ");
            }
            int x = 1;
            for (k = 1; k <= (2 * i - 1); k++)
            {
                System.out.print(x + " ");
                if (k < i)
                    x++;
                else
                    x--;
            }
            System.out.println();
        }
    }
}