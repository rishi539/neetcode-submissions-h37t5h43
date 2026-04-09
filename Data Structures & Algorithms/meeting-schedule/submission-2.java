/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if(intervals.isEmpty())return true;
        Collections.sort(intervals,Comparator.comparingInt(i -> i.end));
        int prev=intervals.get(0).end;
        intervals.remove(0);
        for(Interval i:intervals){
            if(i.start<prev){
                return false;
            }
            prev=i.end;

        }
        return true;

    }
}
