

public class alphabet
{
    public static void main(String[] args)
    {
        char ch='8';
        if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
            System.out.println("alphabet");
        else if (ch>='0' && ch<='9')
        {
            System.out.println("number");
        }
        else
            System.out.println("special character");
    }
}
