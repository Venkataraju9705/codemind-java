import java.util.Scanner;
class Grade
{
   public static void main(String args[])
   {
    int h,s,sf;
    Scanner sc=new Scanner(System.in);
    h=sc.nextInt();
     s=sc.nextInt();
     sf=sc.nextInt();
     if (h>50&&s>60&&sf>100)
       {
         System.out.println("10");
        }
        else if(h>50&&s>60)
       {
          System.out.println("9");
       }
        else if(s>60&&sf>100)
       {
         System.out.println("8"); 
        }
         else if(h>50&&sf>100)
        {
          System.out.println("7");
          }
          else if(h>50)
           {
            System.out.println("6");
           }
           else
           {
             System.out.println("5");
      }
} 
} 