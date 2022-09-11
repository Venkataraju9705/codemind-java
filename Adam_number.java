import java.util.Scanner; 
class adam
{
  public static void main(String args[])
  {
  Scanner sc=new Scanner(System.in);
   int n,m,sq1,sq2,rev1=0,rev2=0,rem1=0,rem2=0;
n=sc.nextInt();
sq1=n*n;
m=n;
 while(n>0)
{
rem1=n%10;
rev1=rev1*10+rem1;
n=n/10;
}
 sq2=rev1*rev1;
  while(sq2>0)
{
rem2=sq2%10;
rev2=rev2*10+rem2;
sq2=sq2/10;
}
if(sq1==rev2)
{
 System.out.println("True");
}
else
 System.out.println("False");
}
}
 