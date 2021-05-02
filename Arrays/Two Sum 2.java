class Solution {
    public int[] twoSum(inta[] num, int target) {
        int l=0, r=num.length-1,s=0;
        while(l<r)
        {
            s=num[l]+num[r];
            if (s>target)
                r--;
            else if(s<target)
                l++;
            else
                return new int[]{l+1,r+1};
            
        }
        throw new IllegalArgumentException("Wrong");
        
        
    }
}
