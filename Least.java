import java.util.*;
public class Least
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String ab[]=sc.nextLine().split("");
        int k=sc.nextInt();
        int l=ab.length;
        ArrayList<Integer>al=new ArrayList<Integer>();
        for(int i=0;i<l;i++)
        {
            int tem=Integer.parseInt(ab[i]);
            al.add(tem);
        }
        Collections.sort(al);
        for(int i=l-1;i>=k;i--)
        al.remove(al.get(i));
        int h=l-k;
        for(int i=0;i<h;i++)
        System.out.print(al.get(i));
    }
}
