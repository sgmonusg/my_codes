#include <stdio.h>
int min;
void loop(int l,int count,int n,int s[])
{

     if (l>n||l<0)
        {return;}
    if (count>n)
        {return;}
     if (l==n)
     {

         if (count<min)
         {
             min = count;
         }
         return;
     }
     int k = count;
     int h = l;
     h++;
     k++;
     loop(h,k,n,s);
     k = count+1;
     h = l+s[l];
     loop(h,k,n,s);
}
int main()
{
    int t,i,j,k,l,n,s[50],count;
    scanf("%d",&t);
    for (i=1;i<=t;i++)
    {
        count = 0;l=0;min=100;
        scanf("%d",&n);
        for (j=0;j<n;j++)
            scanf("%d",&s[j]);
        loop(l,count,n,s);
        printf("%d\n",min);
    }
    return 0;
}
