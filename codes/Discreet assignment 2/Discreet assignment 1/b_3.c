#include<stdio.h>
#include<math.h>
int main()
{
    int t;
    scanf("%d",&t);
    int j=0;
    for(j=0;j<t;j++){
        int m;
        scanf("%d",&m);
        int n;
        scanf("%d",&n);
        int i=0;
        unsigned long long int sum=1;
        unsigned long long int sum1=1;
        for(i=1;i<=((m>n)?n:m);i++){
            sum=sum*i;
        }
        for(i=(m>n)?m+1:n+1;i<=m+n;i++){
            sum1=sum1*i;
        }
        sum1=sum1/sum;
        printf("%llu\n",sum1);
        sum=1;
        sum1=1;
    }
    return 0;
}
