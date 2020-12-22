class Solution {
    public double findMaxAverage(int[] nums, double k) {
        int left=1;
        int right=(int)k;
        int sum=0,i=0;

        while(i<k)
        {
            sum=nums[i]+sum;
            i++;
        }
        double avg=sum/k;
        while(right<nums.length)
            
        {   System.out.println(sum);
            sum=sum-nums[left-1]+nums[right];
            avg=Math.max(avg,(sum/k));
            left++;
            right++;
            
        }
       return avg;
        
            
        
        
        
    }
}
