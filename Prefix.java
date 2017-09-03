import java.util.*;
public class Prefix
{
    public static void main(String args[])
    {
        int i,j;
        Scanner sc=new Scanner(System.in);
        String ab=sc.nextLine();
        String s[]=ab.split(" ");
        int l=s.length;
        int n=s[0].length();
        String s1=s[0];
        String prefix="";
        for(i=0;i<n;i++)
        {
            int count=0;
            for(j=0;j<l;j++)
            {
                String s2=s[j];
                if(i<s2.length())
                if(s1.charAt(i)==s2.charAt(i))
                 count++;
                else 
                break;
            }
            if(count==l)
            {
                prefix=prefix+(s1.charAt(i));
            }
            }
        System.out.println(prefix);
    }
}




