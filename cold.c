#include<stdio.h>
int main()
{
    int n,i;
    int count=0;
    (void) scanf("%d",&n);
    long long a[n];
    for(i=0;i<n;i++){
        (void)scanf("%lld",&a[i]);
        if(a[i]<0){
            count++;
        }
    }
    printf("%d",count);
    return 0;
}
