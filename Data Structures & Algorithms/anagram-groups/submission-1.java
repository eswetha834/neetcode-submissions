class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String ,List<String>> hm=new HashMap<>();
        for(String s:strs){
            char a[]=s.toCharArray();
            Arrays.sort(a);
            String o=new String(a);
            if(!hm.containsKey(o)){
                hm.put(o,new ArrayList<>());
            }
            hm.get(o).add(s);

        }
        return new ArrayList<>(hm.values());
    }
}
