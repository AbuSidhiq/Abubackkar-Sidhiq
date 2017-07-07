import java.util.*;
public class Guvi_SecondLetter
{
    public static void main(String args[])
    {
        int i;
        Scanner sc=new Scanner(System.in);
        String ab=sc.nextLine();
        char ch=Character.toUpperCase(ab.charAt(1));
        System.out.print(ab.charAt(0));
        System.out.print(ch);
        for(i=2;i<ab.length();i++)
        System.out.print(ab.charAt(i));
    }
}
