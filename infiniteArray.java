public class infiniteArray{
    public static int infiArray(int[] arr, int target){
        int start =0;
        int end =1;
        // condition 
        while(target > arr[end]){
            int temp = end +1; // this is the new start
            end = end +(end -start +1);
            start = temp;

        }
        return search(arr, target, start, end);
    }
    public static int search(int[] arr,int target, int start, int end){
        
        while(start <= end){
            int mid = start + (end -start)/2;
            if(target > arr[mid]){
                start = mid +1;
            }else if (target < arr[mid]){
                end = mid -1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{3, 5, 7, 9, 10, 90,
            100, 130, 140, 160, 170};
        int target = 10;
        System.out.print(infiArray(arr, target));
    }

}
