class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int l=0; int r=plants.length-1;
        int cntFill = 0;
        int A = capacityA;
        int B = capacityB;

        while (l<r){
         
          

            if(A < plants[l]){
               cntFill +=1;
               A= capacityA;
            }
            

            if(B <plants[r]){
                   cntFill +=1;
                   B = capacityB;
            }
            
            A -= plants[l++];
            B -= plants[r--];

        }
        
          if(l==r && A < plants[l] && B < plants[r] ) cntFill++;

        return cntFill;

    }
}