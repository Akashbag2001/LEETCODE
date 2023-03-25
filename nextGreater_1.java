class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
          int nxtGreater[] = new int[nums2.length]; 
        Stack<Integer> s= new Stack<>();

        for(int i=nums2.length-1;i>=0;i--){
            while(!s.isEmpty() &&nums2[s.peek()] <= nums2[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nxtGreater[i] = -1;
            }else {
                nxtGreater[i] = nums2[s.peek()];
            }
            s.push(i);
        }
        int ans[] = new int[nums1.length];
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            hm.put(nums2[i],nxtGreater[i]);
        }
        for(int j =0;j<nums1.length;j++){   
            ans[j] =hm.get(nums1[j]);
        }
        return ans;
     
    }
}
