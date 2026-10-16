
public class buyNSell {

    public static int getMaxProfit(int[] prices, int n) {

        int maxProfit = 0;
        int bestBuy = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){
            if(prices[i] < bestBuy ) {
                bestBuy = prices[i];
            }
            int profit = prices[i] - bestBuy;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }

    public static int bruteForceMaxProfit(int prices[], int n) {
        int maxProfit = 0;
        for(int i = 0; i<n; i++) {
            for(int j = i + 1; j<n; j++) {
                int profit = prices[j] - prices[i];
                maxProfit = Math.max(maxProfit, profit);
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.print(getMaxProfit(prices, prices.length));
    }
}
