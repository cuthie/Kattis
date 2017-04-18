import java.util.*;

class Visit
{
    public static void main(String[] args)
    {
        Scanner inp=new Scanner(System.in);
        List<String> st=new ArrayList<String>();
        int t=inp.nextInt();
        int count;
        int n;
        for(int i=1;i<=t;i++)
        {
            n=inp.nextInt();
            count=0;
            for(int j=1;j<=n;j++)
            {
                String s=inp.next();
                if(st.isEmpty()||(!st.contains(s)))
                {
                    st.add(s);
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}