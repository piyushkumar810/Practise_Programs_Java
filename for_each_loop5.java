import java.util.ArrayList;

public class for_each_loop5 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add(new laptop1("hp", 8));
        al.add(new laptop1("asus", 16));
        al.add(new laptop1("lanvo", 4));

        for (Object o : al) {
            laptop b = (laptop)o;
            System.out.println(b.brand);
            System.out.println(b.ram);
        }
    }
}
        class laptop1{
            String brand;
            int ram;
        laptop1(String brand,int ram)
        {
            this.brand=brand;
            this.ram=ram;
        }
}
