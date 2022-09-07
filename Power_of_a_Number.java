import java.util.Scanner;
class power
{
   public static void main(String args[])
   {
       int x,y,m,mod,res;
    Scanner sc=new Scanner(System.in);
    x=sc.nextInt();
    y=sc.nextInt();
    m=sc.nextInt();
    res=(int)Math.pow(x,y);
    mod=res%m;
    System.out.println(mod);
    }
}
     
          
      

 