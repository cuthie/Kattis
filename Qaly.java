import java.util.*;
class Qaly
{
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        double s=0;
        for(int i=1;i<=n;i++)
        {
            double a=inp.nextDouble();
            double b=inp.nextDouble();
            s=s+(a*b);
        }
        System.out.println(s);
    }
}
