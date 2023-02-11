// problem link : https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class mountain {
    public static int findInMountainArray(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnosticBS(arr, target, peak+1, arr.length-1);
    } 
    public static  int peakIndexInMountainArray(int[] arr) {
        int start =0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end -start)/2;
            if(arr[mid] > arr[mid+1]){
                end =mid;
            }else{
                start = mid+1;
            }
        }
        return start; // or end as both are same
    }

    public static int orderAgnosticBS(int[] arr,int target,int start, int end){
        
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end -start)/2;
            if(target == arr[mid]){
                return mid;
            }
           if(isAsc){
            if(target > arr[mid]){
                start = mid+1;
            }else {
                end = mid -1;
            }
           }else{
            if(target > arr[mid]){
                end = mid -1;
            }else {
                start = mid +1;
            }
           }
            
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 4;
        int ans = findInMountainArray(arr, target);
        System.out.println(ans);
    }
}
