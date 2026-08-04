class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=prices[0];
        int minprofit=prices[0];
        int maxi=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minprofit){
                minprofit=prices[i];
            }
           maxprofit=prices[i]-minprofit;
           if(maxi<maxprofit){
            maxi=maxprofit;
           }
        }
        return maxi;
    }
}
