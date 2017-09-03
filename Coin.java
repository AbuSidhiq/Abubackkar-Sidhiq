import java.util.*;
public class Coin
{
public static void main(String args[])
{
int i,n,count=0,j,k=0,init,t=0;
Scanner s=new Scanner(System.in);
String str[]=s.nextLine().split(",");
int sum=s.nextInt();
int l=str.length;
int coins[]=new int[l];
for(i=0;i<l;i++)
   coins[i]=Integer.parseInt(str[i]);
Arrays.sort(coins);
 init=sum;
 t=l;
while(k<t)
{
  if(init>=coins[l-1])
    {
     n=init/coins[l-1];
     init=init%coins[l-1];
     count=count+n;
    }
  if(init==0)
  break;
  k++;
  l--;
}
System.out.println(count);
} 
}
