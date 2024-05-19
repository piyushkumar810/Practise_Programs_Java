import java.util.ArrayList;
import java.util.Collections;

public class for_each_loop3
{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(5);
        al.add(9);
        al.add(7);
        al.add(5);
        al.add(1);
//
//        for (Object o : al) {
//            System.out.println(o);
//        }

        Collections.sort(al);
        for (Object o : al) {
            System.out.println(o);
        }
    }
}
