#include<stdio.h>
void main()
{
    int i,j,t,n,e,color[20];
    int treat;
    unsigned int a[190][2];
    scanf("%d",&t);
    if((t>5)||(t<1))
        return;
    while(t)
    {
        treat=1;
        scanf("%d%d",&n,&e);
        if((n<2)||(n>20)||(e>190)||(e<1))
        return;
        for(i=0;i<e;i++)
            scanf("%u%u",&a[i][0],&a[i][1]);
        for(i=0;i<n;i++)
            color[i]=0;
        for(i=0;i<e;i++)
        {
            if((color[a[i][0]]==0)&&(color[a[i][1]]==0))
               {
                  color[a[i][0]]=1;
                  color[a[i][1]]=-1;
               }
            else if((color[a[i][0]]==1)&&(color[a[i][1]]==0))
                color[a[i][1]]=-1;
            else if((color[a[i][1]]==1)&&(color[a[i][0]]==0))
                color[a[i][0]]=-1;
            else if((color[a[i][0]]==-1)&&(color[a[i][1]]==0))
                color[a[i][1]]=1;
            else if((color[a[i][1]]==-1)&&(color[a[i][0]]==0))
                color[a[i][0]]=1;
        }
        for(i=0;i<e;i++)
        {
           if(color[a[i][0]]==color[a[i][1]])
                treat=-1;
        }
        if(treat==-1)
            printf("Trick\n");
        else
            printf("Treat\n");

    t--;
    }
    }
