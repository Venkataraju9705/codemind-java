import java.util.Scanner;
class NearestPrime
{
    public static boolean isprime(int x)
    {
        int count=0;
        for(int i=2;i<=Math.sqrt(x);i++)
        {
            if(x%i==0)
            count++;
        }
        if(count==0)
        return true;
        else
        return false;
        }
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int n,m,d1,d2=0,i,t,diff1,diff2;
            t=sc.nextInt();
            {
                for(int j=1;j<=t;j++)
                {
                    
                    n=sc.nextInt();
                    m=n;
                    
                    for(i=n;;i++)
                    {
                        
                        if(isprime(i))
                        {
                            d1=i;
                            break;
                        }
                        }
                        for(i=n;i>1;i--)
                        {
                            if(isprime(i))
                            {
                                d2=i;
                                break;
                            }
                        }
                        
                        diff1=Math.abs(m-d1);
                        diff2=m-d2;
                        
                        if(diff1<diff2)
                        System.out.println(d1);
                        else
                        System.out.println(d2); 
                }
            }
        }
}    
