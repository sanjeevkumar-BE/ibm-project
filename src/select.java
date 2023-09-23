public class select {
    public static void selection(int[] arr){
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            int temp=i;
            for(int j=i+1; j<n; j++) {
                if (arr[j] < arr[temp]) {
                    temp = j;
                }
            }
            int small=arr[temp];
            arr[temp]=arr[i];
            arr[i]=small;
        }
    }
    public static void main(String[] args) {
        int[] arr={10,4,2,3,1};
        selection(arr);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }

}
