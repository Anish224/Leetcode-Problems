class Solution {
    public int majorityElement(int[] nums) {
        int count = (nums.length)/2;
        int num = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);   
        }
        Set<Integer> keys = map.keySet();
        for(int key: keys){
            if(map.get(key)>count){
                num = key;
            }
        }
        return num;
    }
}