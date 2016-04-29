#include<stdio.h>

int parent(int i){
	return (i-1)/2;
}
void insertMinHeap(int arr[],int n,int element){
	int i=0;
	while(arr[i]!=0){
		i++;
	}
	arr[i]=element;
	while(i!=0&&arr[parent(i)]>arr[i]){
		int temp =arr[i];
		arr[i]=arr[parent(i)];
		arr[parent(i)]=temp;
		i=parent(i);
	}
}

void heapify(int arr[],int n,int i){
	int min=i;
	int left=2*i+1;
	int right=2*i+2;
	if(left<n&&arr[left]<arr[min]){
		min=left;
	}
	if(right<n&&arr[right]<arr[min]){
		min=right;
	}
	if(min!=i){
		int temp=arr[i];
		arr[i]=arr[min];
		arr[min]=temp;
		heapify(arr,n,min);
	}

}

int main(){
	int n;
	scanf("%d",&n);
	int arr[n];
	int i=0;
	int k;
	scanf("%d",&k);
	int arr1[k];
	for(i=0;i<n;i++){
		scanf("%d",&arr[i]);
	}
    for(i=0;i<k;i++){
        arr1[i]=0;
    }
	for(i=0;i<k;i++){
		insertMinHeap(arr1,k,arr[i]);
	}
	for(i=k;i<n;i++){
		if(arr1[0]<arr[i]){
				arr1[0]=arr[i];
				heapify(arr1,k,0);
		}
	}
	for(i=0;i<k;i++){
        printf("%d",arr1[i]);
	}
	printf("\n");
	printf("%d",arr1[0]);

}
