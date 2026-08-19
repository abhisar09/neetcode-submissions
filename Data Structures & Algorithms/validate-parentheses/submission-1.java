class Solution {
    public boolean isValid(String s) {
        Stack<Character> st= new Stack<Character>();
        Map<Character,Character> mpp= new HashMap<Character,Character>();
        mpp.put(')','(');
        mpp.put('}','{');
        mpp.put(']','[');
        for(char c:s.toCharArray())
        {
            if(mpp.containsKey(c))
            {
                if(!st.isEmpty()&&st.peek()==mpp.get(c))
                {
                    st.pop();
                }
                else
                {
                    return false;
                }
            }
            else
            {
                st.push(c);
            }
        }
        return st.isEmpty();
    }
}
