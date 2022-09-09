import java.util.Scanner;
class simple
{
  public static  void main(String args[])
  {
     double p,t,r,ci=0;
 Scanner sc=new Scanner(System.in);
     p=sc.nextDouble();
      r=sc.nextDouble();
      t=sc.nextDouble();
      ci=p*Math.pow((1+r/100),t);
   System.out.format("%.2f",+ci);
 }
}

