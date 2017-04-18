import java.util.*;

public class FizzBuzz{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x=inp.nextInt();
        int y=inp.nextInt();
        int n=inp.nextInt();
        for(int i=1;i<=n;i++){
            if(i%x==0){
                if(i%y==0){
                    System.out.println("FizzBuzz");
                }else{
                    System.out.println("Fizz");
                }
            }else{
                if(i%y==0){
                    System.out.println("Buzz");
                }else{
                    System.out.println(i);
                }
            }
        }
    }
}