#include<stdio.h>
int main(){
int v;
int sum=0;
scanf("%d",&v);
int arr[v];
int i=0;
int temp=0;
int temp1=0;
int temp2=0;
for(i=0;i<v;i++){
scanf("%d",arr[i]);
}
for(i=0;i<v;i++){
    sum=sum+arr[i];
}
if(sum%2==0){
        for(i=0;i<v;i++){
            if(arr[i]==1){
            temp=temp+1;
            }

            if(arr[i]==v-1){
            temp1=temp1+1;
            }
        }
        if(temp==v-1&&temp1==1){
            printf("star\n");
            temp2=1;
            return 0;
        }
        temp=0;
        temp1=0;
        for(i=0;i<v;i++){
            if(arr[i]==2){
                temp=temp+1;
            }
        }
            if(temp==v){
                printf("cycle\n");
                temp2=1;
                return 0;
            }
            temp=0;
            temp1=0;
        for(i=0;i<v;i++){
            if(arr[i]==3){
                temp=temp+1;
            }
            else if(arr[i]==v-1){
                temp1=temp1+1;

            }
        }
        if(temp==v-1&&temp1==1){
            printf("wheel\n");
            temp2=1;
            return 0;
        }
        temp=0;
        temp1=0;
        for(i=0;i<v;i++){
            if(arr[i]==v-1){
                temp=temp+1;
            }

        }
        if(temp==v){
            printf("complete\n");
            temp2=1;
            return 0;
        }
        if(temp2=0){
            printf("none\n");
        }
        }


else
    printf("invalid\n");
}

