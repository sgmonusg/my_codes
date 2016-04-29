#include<stdio.h>
int main()
{
	int T;
	scanf("%d",&T);
	while(T--)
	{
		char str[10],en[10];
		scanf(" %s %s",&str,&en);
		int a=(en[0]-str[0]+26)%26,i,j,s,n;

		for(i=1;i<26;++i)
		for(j=1;j<=5;++j)
		if((i*j)%26 == a)
		{
			s = i;
			n = j;
		}
		printf("%d %d\n",s,n);
	}
	return 0;
}
