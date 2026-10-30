import java.util.*;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> arr = new ArrayList<>();

        boolean insert = false;

        // Step 1: Insert newInterval at correct position
        for (int[] interval : intervals) {

            if (!insert && newInterval[0] <= interval[0]) {
                arr.add(newInterval);
                insert = true;
            }

            arr.add(interval);
        }

        if (!insert) {
            arr.add(newInterval);
        }

        // Step 2: Merge intervals
        List<int[]> res = new ArrayList<>();

        int start1 = arr.get(0)[0];
        int end1 = arr.get(0)[1];

        for (int i = 1; i < arr.size(); i++) {

            int start2 = arr.get(i)[0];
            int end2 = arr.get(i)[1];

            if (end1 >= start2) {

                start1 = Math.min(start1, start2);
                end1 = Math.max(end1, end2);

            } else {

                res.add(new int[]{start1, end1});

                start1 = start2;
                end1 = end2;
            }
        }

        res.add(new int[]{start1, end1});

        return res.toArray(new int[res.size()][]);
    }
}