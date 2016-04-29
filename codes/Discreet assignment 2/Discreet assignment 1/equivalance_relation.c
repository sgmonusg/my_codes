#include<stdio.h>
#include<math.h>
int main(){
	long long int i,j,count =0,a,b,t,n,m;
	float p;
	scanf("%lld",&t);
	for(i=0;i<t;i++){
		scanf("%lld",&a);
		scanf("%lld",&b);
		m = a|b;
		n = a&b;
		p = pow(2,32)-1;
		printf("%lld\n",m);
		printf("%lld\n",n);
		printf("%lld\n",p-b);
		printf("%lld\n",a-n);
		while(a!=0){
			count = count + a%2;
			a = a/2;
		}
		printf("%lld\n",count);
	}
	return 0;
}
