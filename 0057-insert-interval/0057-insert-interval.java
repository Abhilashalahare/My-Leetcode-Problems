class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0) {
            return new int[][]{newInterval};
        }

        List<int[]> ans = new ArrayList<>();
        int i = 0, n = intervals.length;
        int st = newInterval[0], end = newInterval[1];

        // Add all intervals before newInterval
        while (i < n && intervals[i][1] < st) {
            ans.add(intervals[i]);
            i++;
        }

        // Merge overlapping intervals
        while (i < n && intervals[i][0] <= end && intervals[i][1] >= st) {
            st = Math.min(st, intervals[i][0]);
            end = Math.max(end, intervals[i][1]);
            i++;
        }
        ans.add(new int[]{st, end});

        // Add remaining intervals
        while (i < n) {
            ans.add(intervals[i]);
            i++;
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
