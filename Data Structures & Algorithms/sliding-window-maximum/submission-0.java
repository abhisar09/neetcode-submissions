class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> ls= new ArrayList<>();
        for(int i=0;i<nums.length-k+1;i++)
        {
            int l=i;
            int r=l+k-1;
            int max=Integer.MIN_VALUE;
            for(int j=l;j<=r;j++)
            {
                if(nums[j]>max)
                max=nums[j];
            }
            ls.add(max);
        }
        int[] soln=new int[ls.size()];
        for(int i=0;i<ls.size();i++)
        soln[i]=ls.get(i);
        return soln;
    }
}
