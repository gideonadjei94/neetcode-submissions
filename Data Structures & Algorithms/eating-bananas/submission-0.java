class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int ans = r;

        while(l <= r){
            int k = l + (r - l) / 2;

            int totalHrs = 0;
            for(int p : piles){
                totalHrs += Math.ceil((double)p / k);
            }

            if(totalHrs <= h){
                ans = k;
                r = k - 1;
            }else
                l = k + 1;
        }

        return ans;
    }
}
