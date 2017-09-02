import java.util.*;
public class Guvi_Hunter4
{
    public static void main(String args[])
    {
        int i;
        Scanner sc=new Scanner(System.in);
        String ab[]=sc.nextLine().split(",");
        int l=ab.length;
        int arr[]=new int[l];
        for(i=0;i<l;i++)
        arr[i]=Integer.parseInt(ab[i]);
        Map<String,Integer>mp=new TreeMap<String,Integer>();
        for(i=0;i<l;i++)
        {
            if(mp.containsKey(ab[i]))
            mp.put(ab[i],mp.get(ab[i])+1);
            else
            mp.put(ab[i],1);
        }
        int k=0,min=0;
        for(Map.Entry m:mp.entrySet())
        {
             i=(int)m.getValue();
            if(k==0){min=i;k++;}
            else if(i<min){min=i;}
        }
        for(Map.Entry m:mp.entrySet())
        {
            i=(int)m.getValue();
            if(min==i)
            {System.out.println(m.getKey());break;}
        }
    }
}
