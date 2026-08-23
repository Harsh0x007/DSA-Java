public class buyNSell {
    public static int profit(int prices[], int itr, int minPrice, int maxProfit) {

        if( itr >= prices.length) {
            return maxProfit;
        }

        if(prices[itr] < minPrice) {
            return profit(prices, itr + 1, prices[itr], maxProfit);
        }
        int profit = prices[itr] - minPrice ;    
        if(maxProfit < profit) {
            return profit(prices, itr + 1, minPrice, profit);
        }
        return profit(prices, itr + 1, minPrice, maxProfit);
    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        int minPrice = prices[0];
        System.out.print(profit(prices, 0, minPrice, 0));
    }
}