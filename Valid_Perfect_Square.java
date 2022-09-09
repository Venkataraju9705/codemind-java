import java.util.Scanner;
class perfect
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     int n,t,square=0,sq;
     t=sc.nextInt();
      for(int i=1;i<=t;i++)
    {
      n=sc.nextInt();
      sq=(int)Math.sqrt(n);
      if(sq>0)
      square=sq*sq;
       if(square==n)
     System.out.println("True");
     else
   System.out.println("False");
  }
 }
}
