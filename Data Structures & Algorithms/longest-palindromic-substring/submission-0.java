class Solution {
    public String longestPalindrome(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
        String sub=s.substring(i,j);
        String rev=new StringBuilder(sub).reverse().toString();
        if(rev.equals(sub) && ans.length()<sub.length()){
            ans=rev;
        }
            }}
        return ans;
    }
}
