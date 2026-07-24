class Solution {
    public int characterReplacement(String s, int k) {
        int maxLength=0;
        int maxFreq=0;
        int l=0,r=0;
        Map <Character,Integer> mpp= new HashMap<>();
        while(r<s.length())
        {
            mpp.put(s.charAt(r), mpp.getOrDefault(s.charAt(r), 0) + 1);
            maxFreq=Math.max(maxFreq,mpp.get(s.charAt(r)));
            while((r-l+1)-maxFreq>k)
            {
                mpp.put(s.charAt(l),mpp.get(s.charAt(l))-1);
                maxFreq=0;
                for(Map.Entry<Character,Integer> entry: mpp.entrySet())
                { 
                    maxFreq=Math.max(maxFreq, entry.getValue());
                }
                l++;
            }
            if((r-l+1)-maxFreq<=k)
            {
                maxLength=Math.max(maxLength,r-l+1);
            }
            r++;
        }
        return maxLength;
    }
}
