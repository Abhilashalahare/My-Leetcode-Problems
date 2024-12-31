class Solution {
    public String[] findRelativeRanks(int[] score) {
          int n=score.length;
        String ans[]=new String [n];
        Integer indexs[]=new Integer[n];
        PriorityQueue<int[]> maxheap=new PriorityQueue<>((a,b) -> Integer.compare(b[1],a[1]));
         
         for(int i=0;i<n;i++)
         {
            maxheap.add(new int[]{i,score[i]});
         }

         for(int i=0;i<n;i++)
         {
            int[] a=maxheap.poll();
            if(i==0)
            ans[a[0]]="Gold Medal";
            else if(i==1)
            ans[a[0]]="Silver Medal";
            else if(i==2)
            ans[a[0]]="Bronze Medal";
            else
            ans[a[0]]=i+1+"";
         }

        return ans;
    }
}