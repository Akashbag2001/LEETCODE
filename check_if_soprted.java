class Solution {
    public boolean check(int[] arr) {
        int n = arr.length;
        int rotation =0;
        for(int i=1;i<n;i++){
            if(arr[i] < arr[i-1]){
                rotation++;
                if(rotation > 1){
                    return false;
                }
            }
        }
        if(rotation ==1){
            return arr[n-1] <= arr[0];
        }
        return true;
    }
}
