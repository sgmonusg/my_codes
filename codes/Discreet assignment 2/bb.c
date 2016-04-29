#include <stdio.h>
#include <stdlib.h>

void print(int v,int *arr[v]);
int matcheck(int v,int arr[v][v]);
void mul(int v,int *adj[v],int *iter[v]);
int main(){
	int i,j;
	int v,e;
	scanf("%d",&v);
	scanf("%d",&e);

	//int adj[v][v];int iter[v][v];

	int *(adj[v]);
	for(i=0;i<v;i++){
		adj[i]=malloc(sizeof(int)*v);
	}
	int *(iter[v]);
	for(i=0;i<v;i++){
		iter[i]=malloc(sizeof(int)*v);
	}


	for(i=0;i<v;i++){
		for(j=0;j<v;j++) {*(adj[i]+j)=0;*(iter[i]+j)=0;}
	}

	for(i=0;i<e;i++){
		int f,t;
		scanf("%d",&f);
		scanf("%d",&t);
		*(adj[f]+t) = 1;*(iter[f]+t)=1;
		*(adj[t]+f) = 1;*(iter[t]+f)=1;
	}
	//print(v,adj);printf("\n");

	int boolean[v][v];//for completion check
	int mindist[v][v];
	for(i=0;i<v;i++){
		for(j=0;j<v;j++) {
			boolean[i][j]=0;
			mindist[i][j]=0;
		}
		boolean[i][i]=1;
	}
	for(i=0;i<v;i++){
		for(j=0;j<v;j++) {
			if(adj[i][j]==1) {boolean[i][j] = 1;mindist[i][j]=1;}
		}
	}

	int iterno = 1;
	while(matcheck(v,boolean)!=1){
		iterno++;
		mul(v,adj,iter);

		for(i=0;i<v;i++){
			for(j=0;j<v;j++){
				if(boolean[i][j]==0 && *(iter[i]+j)!=0) {boolean[i][j]=1;mindist[i][j]=iterno;}
			}
		}
	}



	//radius
	int R = 99999;
	int temparr[v];
	for(i=0;i<v;i++){
		temparr[i]=mindist[i][0];
		for(j=0;j<v;j++) {if(temparr[i]<mindist[i][j]) temparr[i]=mindist[i][j];}
	}

	for(i=0;i<v;i++) {if(R>temparr[i]) R=temparr[i];}
	printf("%d ",R);

	//diameter
	int D = 0;
	for(i=0;i<v;i++){
		for(j=0;j<v;j++) if(D<mindist[i][j]) D = mindist[i][j];
	}
	printf("%d\n",D);

}

int matcheck(int v,int arr[v][v]){
	int i=0,j=0;
	for(i=0;i<v;i++){
		for(j=0;j<v;j++){
			if(arr[i][j]==0) return 0;
		}
	}
	return 1;
}

void print(int v,int *arr[v]){
	int i,j;
	printf("\n");
	for(i=0;i<v;i++){
		for(j=0;j<v;j++){
			printf("%d ",*(arr[i]+j));
		}
		printf("\n");
	}
	return ;
}

void mul(int v,int *adj[v],int *iter[v]){
	int i,j,z,sum;
	int temparr[v][v];
	for(i=0;i<v;i++){
		for(j=0;j<v;j++){
			sum=0;
			for(z=0;z<v;z++){
				sum+=(*(iter[i]+z))*(*(adj[z]+j));
			}
			//printf("%d  ",sum);
			temparr[i][j]=sum;
			//*(iter[i]+j)=sum;
		}
		//printf("\n");
	}
	//printf("\n");

	for(i=0;i<v;i++){
		for(j=0;j<v;j++){
			*(iter[i]+j) = temparr[i][j];
		}
	}
	return;
}


