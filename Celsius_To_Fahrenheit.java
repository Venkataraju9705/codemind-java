import java.util.Scanner;
class fahr
{
  public static  void main(String args[])
  {
     float c,f;
 Scanner sc=new Scanner(System.in);
     c=sc.nextFloat();
     f=(9*c/5)+32;
   System.out.format("%.2f",+f);
 }
}
