import java.util.Scanner;
class interest
{
  public static  void main(String args[])
  {
     int p,t,r,interest;
 Scanner sc=new Scanner(System.in);
     p=sc.nextInt();
      t=sc.nextInt();
       r=sc.nextInt();     
       interest=p*t*r/100;
   System.out.println(interest);
 }
}
