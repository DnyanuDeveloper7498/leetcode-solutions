class Solution {
    public int lastStoneWeight(int[] stones) {
        
        
             PriorityQueue<Integer> pq
             =new PriorityQueue<>(Collections.reverseOrder());

             for(int num:stones)
             {
               pq.add(num);
             }

               while(pq.size()>1)
               {

               int x=pq.poll();
               int y=pq.poll();
             
             if(x!=y)
              {
                 int ans =x-y;
                 pq.add(ans);
              }
              
             }

       
               if(pq.isEmpty())
               {
                  return 0;
               }
            


             return pq.poll(); 
      
    }
}