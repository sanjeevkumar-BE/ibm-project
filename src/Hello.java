public class Hello {
    public static void bubblesort(int[] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={10,3,2,4,5,22,11,65,78};
        bubblesort(arr);
        for(int c:arr){
            System.out.print(c+"  ");
        }
    }
}