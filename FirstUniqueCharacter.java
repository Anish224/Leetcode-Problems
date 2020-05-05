class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int ans = 0;
        int count = 0;
        char [] a = s.toCharArray();
        for(char c: a){
            map.put(c,map.getOrDefault(c,0)+1);
            }
        
        for(int i = 0;i<a.length;i++){
            if(count == 1){
                break;
            }
            if(map.get(a[i])==1){
                count ++;
                return i;
            }
            
            
        }
        return -1;
    }
}