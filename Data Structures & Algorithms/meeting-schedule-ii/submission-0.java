class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        if(intervals.size()==0){
            return 0;
        }
        int start[]=new int[intervals.size()];
        int end[]=new int[intervals.size()];
        for(int i=0;i<intervals.size();i++){
            start[i]=intervals.get(i).start;
            end[i]=intervals.get(i).end;
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int c=0,r=0;
        for(int i=0;i<intervals.size();i++){
            if(start[i]<end[c]){
                r++;
            }
            else{
                c++;
            }
        }
        return r;
    }
}
