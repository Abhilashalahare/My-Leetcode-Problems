class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // if(totalGas<totalcost) return -1;
        int stIdx=0;
        int totalgas=0, totalcost=0;
        for(int i=0; i<gas.length; i++){
               totalgas += gas[i];
               totalcost += cost[i];
        }

        if(totalgas<totalcost) return -1;
        
           int currGas = 0;
        for(int i=0; i<gas.length; i++){
             currGas += gas[i] - cost[i]; 
            if(currGas<0){
                currGas=0;
                stIdx = i+1;
            }

           
        }

        return stIdx;
    }
}