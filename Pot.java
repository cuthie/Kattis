import java.util.*;
import java.lang.*;

public class Pot{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int q = inp.nextInt();
        long x=0;
        for(int a=0;a<q;a++){
            int n=inp.nextInt();
            x=x+(long)(Math.pow(n/10,n%10));
        }
        System.out.println(x);
    }
}

