class Solution {
    public List<Integer> getRow(int rowIndex) {
        long value =1;
        int i = rowIndex;
        List<Integer> row = new ArrayList<>();
        for(int j=0;j<=rowIndex;j++){
            row.add((int)value);
            value = value*(i-j)/(j+1);
        }
        return row;
    }
}