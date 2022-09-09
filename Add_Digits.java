import java.util.Scanner;
class perfect
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
     int n,rem=0;
     n=sc.nextInt();
      if(n<9)
    System.out.println(n);
    else
    {
        rem=n%9;
        if(rem==0)
     System.out.println("9");
     else
   System.out.println(rem);
  }
 }
}
