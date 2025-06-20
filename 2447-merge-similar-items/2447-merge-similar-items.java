class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        for (int[] i : items1) {
            map.put(i[0], map.getOrDefault(i[0], 0) + i[1]);
        }
        for (int[] i : items2) {
            map.put(i[0], map.getOrDefault(i[0], 0) + i[1]);
        }
        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            res.add(Arrays.asList(i.getKey(), i.getValue()));
        }
        return res;
    }
}