import java.util.Scanner;
class prettynumbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,I,r,i,j,count=0;
        t=sc.nextInt();
        for(i=1;i<=t;i++)
        {
            I=sc.nextInt();
            r=sc.nextInt();
            count=0;
            for(j=I;j<=r;j++)
            {
                if(j%10==2 ||j%10==3||j%10==9)
                {
                count++;
                }
                }
               System.out.println(count);
        }
    }
}