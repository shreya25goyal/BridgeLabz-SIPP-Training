public class ProfitLoss
{
    public static void main (String[] args){
    int CostPrice = 129;
    int SellingPrice = 191;
    double profit = SellingPrice - CostPrice;
    double profit_percentage = profit/CostPrice * 100;
    System.out.println("The Cost Price is INR " + CostPrice + " The Selling Price is INR " + SellingPrice + " The profit is INR " + profit + " The profit percentage is: " + profit_percentage);
 }
}