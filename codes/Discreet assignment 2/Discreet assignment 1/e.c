#include <stdio.h>
int main(void) {
	int i,j,k,l,m,n,p,q,r=0;


	scanf("%d %d %d",&n,&m,&q);

	int aim[100][100]={0};

	for(i=0;i<m;i++)
	{
		scanf("%d %d",&k,&p);
		aim[k][p]=1;
	}


	for(i=0;i<100;i++){
        for(j=0;j<100;j++){
            for(k=0;k<100;k++){
                if(aim[i][j] && aim[j][k]) {aim[i][k]=1;}
            }
        }
	}


	for(r=q;r>0;r--){
        scanf("%d",&l);
        int step[l];

        for(i=0;i<l;i++)
		scanf("%d",&step[i]);
		 for(i=0;i<l;i++){
             for(j=i+1;j<l;j++){
                if(aim[step[i]][step[j]]==1 && i!=j) {
                        step[i]=0;
                }
             }
             }
             read:
              for(i=1;i<l;i++){
                    if(step[i-1]>step[i]) {
                        j=step[i-1];
                        step[i-1]=step[i];
                         step[i]=j;
                          goto read;
                          }
                          }
               for(i=0;i<l;i++)
                    if(step[i])
                    printf("%d ",step[i]);
               printf("\n");
	}
	return 0;
}

