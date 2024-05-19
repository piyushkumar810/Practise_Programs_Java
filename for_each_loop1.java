import java.util.ArrayList;

public class for_each_loop1
{
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add("ram");
        al.add("ajay");
        al.add("ajit");
        al.add("rahul");
        al.add("amit");

        for(Object o:al)
        {
            System.out.println(o);
        }
    }
}
