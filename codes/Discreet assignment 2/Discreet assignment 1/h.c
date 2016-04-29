#include <stdio.h>

int groupa(int p,int q,int a[][26]){
    int j;

    if(a[p][p]==0)
        return 0;

    a[p][p]=0;


    for(j=0;j<q;j++){
        if(a[p][j]||a[j][p]){
            a[p][j]=0;
            a[j][p]=0;
            groupa(j,q,a);
    }
    }

    return 1;
}
int main() {
    char r,s;

    int m,n,i,j,k,c=0;
    scanf("%d %d",&m,&n);


    int a[26][26]={0};

    for(k=1;k<=n;k++){
        scanf("\n%c %c",&r,&s);
        a[r-'A'][s-'A']=1;
    }

    for(i=0;i<m;i++)
        a[i][i]=1;
    for(i=0;i<m;i++){
        if(groupa(i,m,a))
            c++;
    }


    printf("%d",c);

    return 0;
}

