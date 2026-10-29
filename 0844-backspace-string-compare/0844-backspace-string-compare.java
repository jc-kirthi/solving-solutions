class Solution {
    public String check(String s){
        StringBuilder st=new StringBuilder();
        int i=0;
        while(i<s.length()){
            char c=s.charAt(i);
            if(c=='#'){
            if(st.length() > 0)
            st.deleteCharAt(st.length() - 1);
        }
            else
            st.append(c);
            i++;
        }
return st.toString();
    }
    public boolean backspaceCompare(String s, String t) {
        String s1=check(s);
        String s2=check(t);
        if(s1.equals(s2))
            return true;
        else 
        return false;    
        
    }
}