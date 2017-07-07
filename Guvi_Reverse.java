import java.util.*;
public class Guvi_Reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        StringBuffer sb=new StringBuffer(str1);
        sb.reverse();
        System.out.print(String.valueOf(sb));
        
    }
}

