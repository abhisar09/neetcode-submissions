class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length())
        return "";
        Map<Character,Integer> mpp1= new HashMap<>();
        for(int i=0;i<t.length();i++)
        {
            char c=t.charAt(i);
            mpp1.put(c,mpp1.getOrDefault(c,0)+1);
        }
        int need=mpp1.size();
        String ans="";
            int min=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++)
        {
            int cur=0;
            Map<Character,Integer> mpp2=new HashMap<>();
            String st="";
            for(int j=i;j<s.length();j++)
            {
                char c= s.charAt(j);
                st=st.concat(Character.toString(c));
                mpp2.put(c,mpp2.getOrDefault(c,0)+1);
                if(mpp1.getOrDefault(c,0)==mpp2.get(c))
                cur++;
                if(cur==need)
                {
                    if(st.length()<min)
                    {
                        min=st.length();
                        ans=st;
                    }
                break;
                }
            }
        }
        return ans;
    }
}
