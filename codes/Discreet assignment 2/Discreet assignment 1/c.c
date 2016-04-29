#include<stdio.h>
#include<math.h>
int main()
{
    int t;
    scanf("%d",&t);
    int n;
    scanf("%d",&n);
    int arr[n];
    arr[0]=1;
    arr[1]=1;
    arr[2]=2;
    int i=0;
    for(i=3;i<n;i++){
        arr[i]=arr[i-1]+arr[i-3];
    }
    printf("%d\n",arr[n-1]);
    return 0;
}
