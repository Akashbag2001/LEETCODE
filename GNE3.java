// IMPORTANT
class Solution {
    public int nextGreaterElement(int n) {
        char[] nums = (Integer.toString(n)).toCharArray();
        int i = nums.length -2;
        StringBuilder ans = new StringBuilder();
        while( i>= 0 &&nums[i]>=nums[i+1]){
            i--;
        }
        if(i == -1){
            return -1;
        }
        int k =nums.length -1;
        while(nums[k] <= nums[i]){
            k--;
        }
        swap(nums,i,k);

        for(int j=0;j<=i;j++){
            ans.append(nums[j]);
        }
        for(int j=nums.length-1;j>i;j--){
            ans.append(nums[j]);
        }

        long ans_ = Long.parseLong(ans.toString());
        return (ans_ > Integer.MAX_VALUE) ? -1 : (int)ans_;



    }
    void swap(char[] nums,int i, int k){
        char temp = nums[i];
        nums[i] = nums[k];
        nums[k] = temp;
    }
}
