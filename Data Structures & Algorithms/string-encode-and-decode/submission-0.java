class Solution {

    public String encode(List<String> strs) {
     StringBuilder sb=new StringBuilder();
     for(String str:strs){
        sb.append(str.length()).append("#").append(str);
     }
     return sb.toString();
    }

    public List<String> decode(String str) {
        int i=0,j=0;
        List<String> ans=new ArrayList<>();
        while(i<str.length()){
            j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int k=Integer.parseInt(str.substring(i,j));
            String ki=str.substring(j+1,k+j+1);
            ans.add(ki);
            i=j+1+k;

        }
        return ans;
    }
}
