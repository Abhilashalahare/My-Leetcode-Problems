class Solution {
    public double myPow(double x, int n) {
        return find(x,(long) n);
    }

    double find(double x, long n){

    
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }

       if(n<0){
        return 1.0/find(x,-n);
       }

        double half = find(x,n/2);
        double sq = half*half;


        if(n%2!=0){
            sq = x*sq;
        }


        return sq;
    
       }
        
    }
