#include <stdio.h>
int search(int arr[],int size, int ele);
int search(int arr[],int size, int ele){
    int ret=0;
    while(ret<size){
        if(arr[ret]==ele)
            return ret;
        ret++;
    }
    return 0;
    }

int main()
{
   int i=0;
   int k=100;
   int arr[100],arr1[100];

   for(i=0;i<k;i++)
	{
        scanf("%d",&arr[i]);
        scanf("%d",&arr1[i]);
    }
    int t;
    scanf("%d",&t);

    int find[t];
    for(i=0;i<t;i++)
        scanf("%d",&find[i]);

    int index;
    for(i=0;i<t;i++)
        {
            index=search(arr1,k,find[i]);
            printf("%d\n",arr[index]);

        }

   return 0;
}
