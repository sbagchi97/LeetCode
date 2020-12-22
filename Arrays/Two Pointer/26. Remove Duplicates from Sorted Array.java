class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1,j=0;
        while(i<nums.length)
        {
            if (nums[j]==nums[i]) // n
                i++;
                
            else
            {
                j++;
                nums[j]=nums[i];
                i++;
                    
            }  
            
        }
        return j+1;
}
    
}
nums[j] will store the first unique element it finds and therafter compares it with subsequent elements. The moment it finds a diff element it stores that in num[j++].
          
