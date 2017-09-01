import java.util.*;
public class Guvi_Hunter31
{
    public static void main(String args[])
    {
        int i;
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split(" ");
        int l=s.length;
        for(i=0;i<l;i++)
        {
            if(Integer.parseInt(s[i])==i)
           System.out.print(s[i]);
        }
    }
}
