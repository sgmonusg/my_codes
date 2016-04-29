#include <stdio.h>
#include<math.h>
void d(int a[]);
void d(int a[])
{
    int i;

    unsigned long long num=0;

    for(i=31;i>=0;i--)
    {
        num = num + a[i]*pow(2,31-i);
    }
    printf("%llu\n",num);
}
int main(void) {
	unsigned long long t,i,j,M,N;

	scanf("%llu",&t);
	while(t--)
	{
		int A[32]={0},J[32]={0};


		scanf("%llu%llu",&M,&N);i=31;j=31;
		while(M>0)
		{
			A[i]=M%2;i--;
			M=M/2;
		}
		while(N>0)
		{
			J[j]=N%2;j--;N=N/2;
		}
        int U[32]={0},I[32]={0},NJ[32]={0},sag=0,X[32]={0};

        for(i=0;i<32;i++)
        {
            if(A[i]==1 || J[i]==1){U[i]=1;}
            if(A[i]==1 && J[i]==1){I[i]=1;}
            if(J[i]==0){NJ[i]=1;}
            if(A[i]==1 && J[i]==0){X[i]=1;}
            if(A[i]==1){sag++;}
        }
        d(U);d(I);d(NJ);d(X);
        printf("%d\n",sag);
	}
	return 0;
}
