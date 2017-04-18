import java.util.*;

public class Tarifa{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x=inp.nextInt();
        int n=inp.nextInt();
        int sum=0;
        for(int a=0;a<n;a++){
            int p=inp.nextInt();
            sum=sum+p;
        }
        System.out.println(((n+1)*x)-sum);
    }
}