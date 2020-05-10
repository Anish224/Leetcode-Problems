class Solution {
    public int findJudge(int N, int[][] trust) {
        int [] one = new int[N];
        int [] two = new int[N];
        for(int i = 0; i<trust.length;i++){
            int a = trust[i][0];
            int b = trust[i][1];
            
            one[a-1]++;
            two[b-1]++;
        }
        for(int i = 0;i<N;i++){
            if(one[i]==0 && two[i]== N-1){
                return i+1;
            }
        }
        return -1;
     
    }
}