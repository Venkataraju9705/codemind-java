import java.util.Scanner;
class strong
{
 public static void main(String args[])
 {
     Scanner sc=new Scanner(System.in);
       int n,sum=0,rem=0,i;
       n=sc.nextInt();
       int m=n;
        while(n>0)
        {
            int fact=1;
            rem=n%10;
            for(i=1;i<=rem;i++)
            {
               fact=fact*i;
              }
                 sum=sum+fact;
                  n=n/10;
                  }
                    if(sum==m)   
                  System.out.println("The number " +m+ " is a strong number");
                   else
                  System.out.println("The number " +m+ " is not a strong number");
   }
}