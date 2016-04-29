class AP{
    AP(int n,int arr[n]){
        int a=arr[0];
        int r=arr[1]-arr[0];
        for(int i=0;i<n;i++)
        {
            int arr1[i]=a+(i)r;
        }
        for(i=0;i<n;i++){
            if(arr[i]==arr1[i]){
                t=1;
            }
            else{
                t=0;
                break;
            }
        }
        if(t==1){
            System.out.println("it is an arthematic progression");
        }
        else{
            System.out.println("it is not a arthematic progression");
        }
    }
}
class GP{
    GP(int n,int arr[n]){
        