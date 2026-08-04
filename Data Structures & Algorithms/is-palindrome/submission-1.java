class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        int y=s.length()-1;
        int u=s.length();
        int k=0;
        if(s.length()<=1){
            return true;
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==s.charAt(y)){
                k++;
                y--;
                if(k==u){
                    return true;
                }
            }
        }
        return false;
            }
}
