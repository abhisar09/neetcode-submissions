class Solution {
    public int trap(int[] height) {
        if(height.length==0)
        return 0;
        int result=0;
        for(int i=0;i<height.length;i++)
        {
            int leftMax=0,rightMax=0;
            for(int j=0;j<i;j++)
            {
                if(height[j]>leftMax)
                leftMax=height[j];
            }
            for(int j=i+1;j<height.length;j++)
            {
                if(height[j]>rightMax)
                rightMax=height[j];
            }
            int res=Math.min(leftMax,rightMax)-height[i];
            if(res>=0)
            result+=res;
        }
        return result;
    }
}
