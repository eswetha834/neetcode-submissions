class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if(intervals.size()==0){
            return true;
        }
        intervals.sort((a,b)->a.start-b.start);
        int end=intervals.get(0).end;
        for(int i=1;i<intervals.size();i++){
            if(end>intervals.get(i).start){
                return false;
            }
            end=intervals.get(i).end;
        }
        return true;
    }
}
