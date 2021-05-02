class Solution 
{
    public int[] twoSum(int[] nums, int target)
    {
        HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
           if (hmap.containsKey(target-nums[i]))
           {
              return new int[]{hmap.get(target-nums[i]),i};
           }
            else
                hmap.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution"); 
    }
    
}
