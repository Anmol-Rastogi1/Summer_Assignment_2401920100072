class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double  windsum=0;
        for(int i=0;i<k;i++){
            windsum+=nums[i];
        }    double maxsum=windsum;
        for(int i=k;i<nums.length;i++){
            windsum+=nums[i]-nums[i-k];
           maxsum=Math.max(maxsum,windsum);
        }
        return maxsum / k;    
    }
}
