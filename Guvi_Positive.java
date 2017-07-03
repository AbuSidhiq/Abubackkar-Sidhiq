import java.util.*;
public class Guvi_Positive
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    long ab=sc.nextLong();
    if(ab!=0)
    {
      if(ab>0)
        System.out.println("Positive Number");
      else
        System.out.println("Negative Number");
    }else
      System.out.println("ZERO");
  }
}

