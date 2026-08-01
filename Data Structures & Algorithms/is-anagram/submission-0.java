class Solution {
    public boolean isAnagram(String s, String t) {
        char f[]=s.toCharArray();
        char y[]=t.toCharArray();
        Arrays.sort(f);
        Arrays.sort(y);
        int k=0;
        if(f.length == y.length){
            for(int  i=0;i<f.length;i++){
                if(f[i]==y[i]){
                    k++;
                    if(k==f.length){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
