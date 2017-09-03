    import java.util.Arrays;
    import java.util.Scanner;
    public class Descending
    {
        public static void main(String args[])
        {
        	Scanner sc=new Scanner(System.in);
        	String str[]=sc.nextLine().split(",");
        	int a[]=new int[str.length];
        	for(int i=0;i<str.length;i++)
        	a[i]=Integer.parseInt(str[i]);
        	Arrays.sort(a);
        	for(int l=str.length-1;l>=0;l--)
        	System.out.println(a[l]);
        }
    }
