#include <stdio.h>

int fun1(int p,int b[],int len);
int fun1(int p,int b[],int len)
{
    int j,x;
    for(j=0;j<len;j++)
    {
        if(b[j]==p){x=j;break;}
    }
    return x;
}

int main(){
    int b[20];
    int aim[20][2];
    int i,j;
    int n,m;

    scanf("%d",&n);
    scanf("%d",&m);


    for(i=0;i<m;i++){
        scanf("%d%d",&aim[i][0],&aim[i][1]);
    }
    for(i=0;i<n;i++){
        b[i]=i+1;
    }
    for(i=0;i<m;i++){

            int j;
            int x,y;
            x=fun1(aim[i][0],b,n);
            y=fun1(aim[i][1],b,n);
            if(x>y){

                for(j=y;j<x;j++)
                    b[j]=b[j+1];

                for(j=x+1;j<n;j++)
                    if(b[j]>aim[i][1])
                        break;
                else b[j-1]=b[j];
                b[j-1]=aim[i][1];
            }
    }
    for(i=0;i<n;i++)
        printf("%d ",b[i]);
        printf("\n");
    return 0;
}
