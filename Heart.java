import java.util.*;
class Heart
{
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        for(int i=1;i<=n;i++)
        {
            int b=inp.nextInt();
            double p=inp.nextDouble();
            double bpm=(60*b/p);
            double min_abpm=bpm-(60/p);
            double max_abpm=bpm+(60/p);
            System.out.println(min_abpm+" "+bpm+" "+max_abpm);
        }
    }
}