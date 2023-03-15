class Solution {
    public int maxArea(int[] height) {
         int max =0;
        // two pointer approach-O(n)
        int lp = 0;
        int rp = height.length-1;
        while(lp < rp){
            int ht = Math.min(height[lp],height[rp]);
            int width = rp-lp;
            int currWater = ht * width;
            max = Math.max(max, currWater);

            if(height[lp] < height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
     return max;
    }
}
