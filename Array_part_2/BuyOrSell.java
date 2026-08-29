public class BuyOrSell {
    public static int stock(int prices[]){
        int BuyP = Integer.MAX_VALUE;
        int MaxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(BuyP<prices[i]){
                int profit=prices[i]-BuyP;
                MaxProfit=Math.max(MaxProfit, profit);
            }else{
                BuyP=prices[i];
            }
        }
        return MaxProfit;
    }
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        System.out.println("profit ="+stock(prices));
    }
    
}
