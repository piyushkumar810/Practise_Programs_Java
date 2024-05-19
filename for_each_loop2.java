import java.util.ArrayList;
import java.util.ListIterator;

public class for_each_loop2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("hello");
        al.add(3);
        al.add(1);
        al.add(false);
        al.add(89.34);

        for (Object o : al) {
            System.out.println(o);
        }

        System.out.println("--------------------------fetching previous value");
//        ListIterator i=al.listIterator(5);

//        ListIterator i = al.listIterator(5);
//        {
//            System.out.println(i.previous());
//            System.out.println(i.previous());
//            System.out.println(i.previous());
//            System.out.println(i.previous());
//            System.out.println(i.previous());
//            System.out.println(i.previous());

//        }

        //        System.out.println("----------------------------using loop for getting previous value");
    ListIterator i = al.listIterator(5);
        for(Object o : al)
    {
        System.out.println(i.previous());

    }
    }
}
