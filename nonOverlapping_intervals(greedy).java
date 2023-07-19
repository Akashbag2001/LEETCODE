class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n= intervals.length;
        int count =1;
        int  prev =0;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1],b[1]));

        for(int i=1;i<n;i++){
            if(intervals[i][0] >= intervals[prev][1]){
                prev =i;
                count++;
            }
        }
        return n-count;
    }
}
