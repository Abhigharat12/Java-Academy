
public class ShareMarket {
    public static void Share(int prices[]) {
        int buy = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > buy) {
                int profit = prices[i] - buy;
                maxProfit = Math.max(profit, maxProfit);
            } else {
                buy = prices[i];
            }
        }

        System.out.println("Maximum Profit: " + maxProfit);
    }

    public static void main(String[] args) {
        int prices[] = {12, 23, 9, 8, 11, 6};
        Share(prices);
    }
}
