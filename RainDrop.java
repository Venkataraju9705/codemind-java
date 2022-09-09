import java.util.Scanner;
class rain
{
    public static void main(String args[])
    {
       int n;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       if(n%3==0&&n%5==0&&n%7==0)
       {
        System.out.println("Pling"+"Plang"+"Plong");
         }
            else if(n%3==0&&n%5==0)
         {
          System.out.println("Pling"+"Plang");
         }
         else if(n%3==0&&n%7==0)
         {
          System.out.println("Pling"+"Plong");
         }
            else if(n%5==0&&n%7==0)
            {
                   System.out.println("Plang"+"Plong");
                 }
                   else if(n%3==0)
                  {
                      System.out.println("Pling");
                 }
                     else if(n%5==0) 
                {
                  System.out.println("Plang");
                }
                     else if(n%7==0)
               {
                     System.out.println("Plong");
              }
               else
                     System.out.println(n);
            }
}                            