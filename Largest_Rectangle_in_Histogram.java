class Solution {
    public int largestRectangleArea(int[] arr) {
        Stack<Integer> s = new Stack<>();
        int n = arr.length;
        int maxArea = 0;
        int nsl[] = new int[n];
        int nsr[] = new int[n];
        // next smaller right
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i] ){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = n;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i); 
        }

        // next smaller to left
        s = new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i] ){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i); 
        }
        // current Area: width = nsr[i] - nsl[i]
        for(int i=0;i<n;i++){
            int height = arr[i];
            int width = (nsr[i] - nsl[i])-1;
            int currArea = height * width;
            maxArea = Math.max(currArea,maxArea);

        }
        return maxArea;
    }
}
