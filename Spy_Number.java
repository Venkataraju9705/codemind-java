import java.util.Scanner;
class Spy
{
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
     int n,sum=0,pro=1,rem=0;
    n=sc.nextInt();
     
     while(n>0)
       {
         rem=n%10;
          sum=sum+rem;
          pro=pro*rem;
          n=n/10;
          }
             if(pro==sum) 
         System.out.println("Spy Number");
         else 
          System.out.println("Not Spy Number");
       
      }

} 