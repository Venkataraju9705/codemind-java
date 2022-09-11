import java.util.Scanner; 
class palindrome
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
   int t,n,m;
t=sc.nextInt();
for(int i=1;i<=t;i++)
{
    n=sc.nextInt();
    int sum=0,r=0;
    m=n;
    while(n>0)
    {
r=n%10;
sum=sum*10+r;
n=n/10;
}
if(m==sum)
 System.out.println("True");
else
 System.out.println("False");
}
}
}
 