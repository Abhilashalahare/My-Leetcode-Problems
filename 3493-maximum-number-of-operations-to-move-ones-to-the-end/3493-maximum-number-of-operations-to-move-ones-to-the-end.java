class Solution {
    public int maxOperations(String s) {
    //     if(s.length() == 1){
    //         return 0;
    //     }
    //     int cnt=0;
    //     int one = 0;
    //     char c[] = s.toCharArray();
    //     for(int i=c.length-1; i>=0; i--){
    //         if(c[i] == '1'){
    //            one = i;
    //         }
    //     }
        
        
    //    for(int i=c.length-2; i>0; i--){   
    //     if(c[i] > 0 && c[i] == '0' && c[i-1] =='1'){
    //         // swap(c[i-1], c[one-1]);
    //         char temp = c[i-1];
    //         c[i-1] = c[one-1];
    //         c[one-1] = temp;

    //         one = i;
    //         cnt++;
            
    //     }
    //    } 
    //    return cnt+1;
    // }

    int n = s.length();
        int result = 0;
        int i = 0;
        int count1seen = 0;

        while (i < n) {
            if (s.charAt(i) == '0') {
                result += count1seen;
                while (i < n && s.charAt(i) == '0') { // move until we reach next '1'
                    i++;
                }
            } else {
                count1seen++;
                i++;
            }
        }

        return result;
    }

    
}