class Solution {
    public int characterReplacement(String s, int k) {
         int ans = 0,j=0,maxfreq=0;
         int freq[]=new int[26];
         for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            freq[ch-'A']++;
            maxfreq=Math.max(maxfreq,freq[ch-'A']);
            while((i-j+1)-maxfreq>k){
                freq[s.charAt(j)-'A']--;
                j++;
            }
            ans=Math.max(ans,i-j+1);
         }
         return ans;
    }
}
