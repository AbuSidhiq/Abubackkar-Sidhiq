import java.util.*;
public class Guvi_Unique
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      String ab=sc.nextLine(),s="";
      for(int i=0;i<ab.length();i++)
      {
          String h=ab.replaceAll(ab.charAt(i)+"","");
          if(ab.length()-h.length()==1)
          s=s+ab.charAt(i);
      }
          System.out.print(s);
      
      
        
        
        
        
        
    }
}
