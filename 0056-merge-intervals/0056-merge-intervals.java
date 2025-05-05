class Solution {
    public int[][] merge(int[][] intervals) {
        int n= intervals.length;
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0] -  b[0];
            } 
        });

        List<int[]> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            //no overlap
            // if ans is empty, ya fir new interval create krna h qki last one se bda h next num
            if(ans.isEmpty() || intervals[i][0] > ans.get(ans.size()-1)[1]){
                 //last interval ka 2nd value (0 idx h isly 1 h)
            //then add new intervals of array
            ans.add(new int[]{intervals[i][0], intervals[i][1]});

            } else{ //overlap — merge by updating the end of the last interval
            ans.get(ans.size()-1)[1] = Math.max(ans.get(ans.size()-1)[1], intervals[i][1]);

            }
        }
            // Convert List<int[]> to int[][]
        return ans.toArray(new int[ans.size()][]);
    }
}