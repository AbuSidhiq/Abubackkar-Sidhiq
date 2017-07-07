import java.util.*;
public class Guvi_Palindrome
{
    public static void main(String args[])
    {
        long rem=0,sum=0;
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        String str1=String.valueOf(n);
        StringBuffer sb=new StringBuffer(str1);
        sb.reverse();
        String str2=String.valueOf(sb);
        if(str1.equals(str2))
        System.out.print("It is Palindrome");
        else
        System.out.print("It is Not Palindrome");
        
    }
}

