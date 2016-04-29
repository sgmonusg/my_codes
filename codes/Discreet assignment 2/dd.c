#include<stdio.h>
int count_odd(int deg[],int n)
{
    int i,c=0;
    for(i=0;i<n;i++)
    {
        if(deg[i]%2!=0)
            c++;
    }
    return c;
}
void main()
{
    int t,i,j,n,m,deg[50],adjacent[50][50];
    unsigned int a[100][2];
    int cnt;
    scanf("%d",&t);
    while(t)
    {
        cnt=0;
        scanf("%d%d",&n,&m);
        for(i=0;i<m;i++)
            scanf("%u%u",&a[i][0],&a[i][1]);
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
              adjacent[i][j]=0;
        }
        for(i=0;i<m;i++)
            adjacent[a[i][0]-1][a[i][1]-1]=adjacent[a[i][1]-1][a[i][0]-1]=1;
        for(i=0;i<n;i++)
        {
            deg[i]=0;
            for(j=0;j<n;j++)
                deg[i]+=adjacent[i][j];
        }
       cnt=count_odd(deg,n);
        if(cnt==2)
            printf("Eulerian path\n");
        else if(cnt==0)
            printf("Eulerian circuit\n");
        else
            printf("neither\n");
            t--;
    }
}
