import java.util.Scanner;
class primes
{
   public static void main(String args[])
   {
    Scanner sc=new Scanner(System.in);
    int a,b,count=0;
    a=sc.nextInt();
    b=sc.nextInt();
    for(int i=a;i<=b;i++)
    {
        count=0;
    for(int j=1;j<=i;j++)    
    {
        if(i%j==0)
        count++;
    }
     if(count==2)
    System.out.println(i);
    }
}
}
     
          
      

 