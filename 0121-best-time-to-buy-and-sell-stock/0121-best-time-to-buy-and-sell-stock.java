class Solution {
    public int maxProfit(int[] prices) {
        
     int buy_price;
     int current_profit;
     int max_profit;

     buy_price=prices[0];  // we need to buy first stock in beginning
     max_profit=0;// initially max profit is zero

     for(int i=1;i<prices.length;i++)
     {
        if(prices[i]<buy_price)  // Update buy_price if next day stock price is decreases.
        {
            buy_price=prices[i];
        }
        else
        {
            current_profit=prices[i]-buy_price;   // calculate current current profit if profit increases
            max_profit=Math.max(current_profit,max_profit);    
        }
     }
     return max_profit;
    }
}