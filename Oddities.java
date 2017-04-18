import java.util.*;
import java.lang.*;

public class Oddities{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int q=inp.nextInt();
        for(int a=0;a<q;a++){
            int n=inp.nextInt();
            if(Math.abs(n)%2==0){
                System.out.println(n+" is even");
            }else{
                System.out.println(n+" is odd");
            }
        }
    }
}