import java.util.*;

class Pet
{
    public static void main(String[] args)
    {
        int tot_pt;
        int p;
        int pt[]=new int[5];
        int max,max_index;
        Scanner inp=new Scanner(System.in);
        for(int i=0;i<5;i++){
            tot_pt=0;
            for(int j=1;j<=4;j++){
              p=inp.nextInt();
              tot_pt=tot_pt+p;
            }
            pt[i]=tot_pt;
        }
        max=pt[0];
        max_index=0;
        for(int i=1;i<5;i++){
            if(max<pt[i]){
                max_index=i;
                max=pt[i];
            }
        }
        System.out.println((max_index+1)+" "+max);
    }
}