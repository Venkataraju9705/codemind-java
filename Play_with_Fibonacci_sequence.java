import java.util.Scanner;
class fib
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=0,n,b=1,c,co=3;
        n=sc.nextInt();
        System.out.print(a+" "+b+" ");
        while(co<=n)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            co++;
        }
    }
}