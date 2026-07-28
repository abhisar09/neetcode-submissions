class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length())
        return "";
        if(t.equals(""))
        return "";
        HashMap<Character,Integer> mpp1= new HashMap<>();
        for(int i=0;i<t.length();i++)
        {
            char c=t.charAt(i);
            mpp1.put(c,mpp1.getOrDefault(c,0)+1);
        }
        Map<Character,Integer> mpp2= new HashMap<>();
        int have=0,need=mpp1.size();
        int l=0;
        String ans=""; int min=Integer.MAX_VALUE;
        for(int r=0;r<s.length();r++)
        {
            char c=s.charAt(r);
            mpp2.put(c,mpp2.getOrDefault(c,0)+1);
            if(mpp1.containsKey(c)&&mpp2.get(c)==mpp1.get(c))
            have+=1;
            while (have==need)
            {
                if(r-l+1<min)
                {
                    ans=s.substring(l,r+1);
                    min=r-l+1;
                }
                char lchar=s.charAt(l);
                mpp2.put(lchar,mpp2.get(lchar)-1);
                if(mpp1.containsKey(s.charAt(l))&& mpp2.get(s.charAt(l))<mpp1.get(s.charAt(l)))
                have-=1;
                l+=1;
            }
        }
        return ans;
    }
}
