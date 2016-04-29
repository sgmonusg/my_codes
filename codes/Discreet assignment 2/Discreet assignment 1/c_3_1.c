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
        int arr[100];
        int i=0;
        for(i=0;i<n;i++){
            scanf("%d",&arr[i]);
        }
        int k=0;
        for(i=0;i<n;i++){
                for(k=0;arr[i]!=0;k++){
                    temp++;
                    arr[i]=arr[i]/10;
                }
                arr[i]=temp-1;
                //printf("%d",arr[i]);
                //printf("%s"," ");
                temp=1;
        }
        //printf("\n");
        temp=1;
        int n1=0;
        for(i=0;i<n-1;i++){
        	if(arr[i]!=arr[i+1]){
        		temp++;
        	}
        }
        n1=temp;
        temp=1;
        int sum=pow(2,(n1-1));
        //printf("%d\n",n1);
        for(i=1;i<n;i++){
        	if(arr[i]!=arr[i-1]){
        		n1--;
        	sum=sum+pow(2,(n1-1));
        }
        else{
        	sum=sum+pow(2,(n1-1));
        }
        }
        printf("%d\n",sum);



    }

    return 0;
}
