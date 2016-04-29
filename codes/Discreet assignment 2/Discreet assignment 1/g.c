#include <stdio.h>

int funct(int aim[],int s, int b)
{
    int i=0;
    int r=0;
    for(i=0;i<s;i++)
    {
        if(aim[i]==b)
            r=r+1;
    }
    return r;
    }



int main()
{
    int p,q;
    scanf("%d %d",&p,&q);

    int a[p];

    int i=0;
    for(i=0;i<p;i++)
        scanf("%d",&a[i]);

    int temp=0;
    int sum=0;
    for(i=1;i<=q;i++)
    {
        temp=funct(a,p,i);
        if(temp>1)
            break;

        sum=sum+temp;
    }

        if(sum!=p)
        printf("INVALID\n");
    else
        printf("VALID\n");

    return 0;
}
