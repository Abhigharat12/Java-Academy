class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int totalApple = 0;
        for (int a : apple){
            totalApple += a;
        }
        Arrays.sort(capacity);
        int capacities = 0;
        int cnt = 0;
        for (int i = capacity.length - 1; i >= 0; i--){
            capacities += capacity[i];
            cnt++;
            if (capacities >= totalApple)
                return cnt;
        }
        return cnt;
    }
}
