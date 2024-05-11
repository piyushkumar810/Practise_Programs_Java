
import java.util.*;
public class codechief3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            String arr[] = {"normal", "huge", "small"};
            int x = sc.nextInt();
            System.out.println(arr[x % 3]);
        }
    }
}
