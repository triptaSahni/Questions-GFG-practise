class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int arr[]=new int[nums.length-k+1];
        int l=0;
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<nums.length;i++)
        {
            while(dq.isEmpty()==false&& nums[dq.getLast()]<=nums[i])
                dq.removeLast();
            dq.addLast(i);
            if(dq.getFirst()==i-k)
            // System.out.println(dq.size()+"  "+nums[dq.getLast()]);
            // if(dq.size()>k)
                dq.removeFirst();
            if(i>=k-1)
            {
                arr[l++]=nums[dq.getFirst()];
            }
        }
        return arr;
    }
}
