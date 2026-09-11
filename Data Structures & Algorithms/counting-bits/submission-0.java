class Solution {
    public int[] countBits(int n) {
        int c=0,u=2;
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++){
            String m=(Integer.toBinaryString(i));
            c=0;
            for(int j=0;j<m.length();j++){
                if(m.charAt(j)=='1'){
                    c++;
                }
            }
            arr[i]=c;
        }
        return arr;
    }
}
