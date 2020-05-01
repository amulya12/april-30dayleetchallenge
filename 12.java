class Solution {
    public int lastStoneWeight(int[] stones) {
         Queue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
   for (int val : stones) {
   	p.add(val);
   }
   while (p.size() > 1) {
   	int first = p.remove();
   	int second = p.remove();
   	p.add(Math.abs(first - second));
   }
   return p.remove();
    }
}