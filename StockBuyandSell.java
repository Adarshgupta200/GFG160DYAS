// User function Template for Java
class StockBuyandSell {
    public int maximumProfit(int prices[]) {
        // code here
        int n = prices.length;
        int pro = 0;
        for(int i=1; i<n; i++){
            if(prices[i]>prices[i-1]){
                pro += prices[i]-prices[i-1];
            }
        }
        return pro;
    }
    public static void main(String[] args) {
        StockBuyandSell sbs = new StockBuyandSell();
        int[] prices = {1, 5, 3, 8, 12};
        int result = sbs.maximumProfit(prices);
        System.out.println("Maximum Profit: " + result); // Output: Maximum Profit: 11
    }
}