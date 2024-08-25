class Solution {
    public long maxKelements(int[] nums, int k) {
        long sum = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>(
            (a,b) -> (b-a)
        );
        for(int n : nums){
            q.add(n);
        }
        while(k-->0){
            int n = q.poll();
            sum += n;
            q.add((int) (Math.ceil((double) n/3)));
        }
        return sum;
    }
}