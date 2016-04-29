#include <stdio.h>

int main()
{
    int u,m,i,j,k,l,count=0;
	int flag,aim[50][50],p,q,x,z;


    scanf("%d %d", &u, &m);


    for (i=1;i<=u;i++)
    {
        for (j=1;j<=u;j++)
            aim[i][j]=0;
    }


    for (i=1;i<=m;i++)
    {
        scanf("%d %d", &p, &q);
        aim[p][q]=1;
    }


    for (k=1;k<=u;k++)
    {
        flag=0;
        for (i=1;i<=u;i++)
        {
		if (i==k)
            continue;
            for (j=1;j<=i;j++)
            {
                if (j==k)
                    continue;
                    if (i==j)
                    {
                        if (aim[i][j]!=1)
                        {
                            flag=1;
                            break;
                        }
                    }
                if (aim[i][j]!=aim[j][i])
                {
                    flag=1;
                    break;
                }
            }
            if (flag==1)
                break;
        }
        if (flag==0)
       {
           for (i=1;i<=u;i++)
           {
               if (i==k)
                continue;
               for (j=1;j<=u;j++)
               {
                   if (j==k)
                    continue;
                   if (aim[i][j]==1)
                   {
                       for (z=1;z<=u;z++)
                       {
                           if (z==k)
                            continue;
                           if (aim[j][z]==1)
                           {
                               if (aim[i][z]!=1)
                               {
                                   flag=1;
                                   break;
                               }
                           }
                       }
                   }
                   if (flag==1)
                    break;
               }
               if (flag==1)
                break;
           }
       }
        if (flag==0)
            count++;
    }
    printf("%d\n",count);
    return 0;
}
