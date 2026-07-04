class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i = 0; i < prices.length; i++) {

            int current = prices[i];

            // cheaper buying price mila
            if(current < minPrice) {
                minPrice = current;
            }

            // aaj sell karte toh kitna profit?
            else {
                int profit = current - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }
}




