#include<stdio.h>
#include<math.h>
int main()
{
    int t;
    scanf("%d",&t);
    int j=0;
    int temp=1;
    for(j=0;j<t;j++){
        int n;
        scanf("%d",&n);
        int arr[100]=0;
        for(i=0;i<n;i++){
            scanf("%d",&arr[i]);
        }
        int k=0;
        for(i=0;i<n;i++){
                for(k=0;arr[i]!=0;k++){
                    temp++;
                    arr[i]=arr[i]/10;
                }
                arr[i]=temp;
                printf("%d",arr[i]);
                temp=1;
        }

    }

    return 0;
}
