class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int [] res = new int[nums.length];
        Arrays.fill(res,-1);
        Stack<Integer> stk = new Stack<>();
        for(int i = 0;i<nums.length*2;i++){
            int num = nums[i%nums.length];
            
                while(!stk.isEmpty() && nums[stk.peek()]<num){
                    res[stk.pop()] = num;
                }if(i<nums.length){
                    stk.push(i);
                }
            
        }
        return res;
    }
}