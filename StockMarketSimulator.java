import java.util.Scanner;
import java.util.List;

public class StockMarketSimulator {
    public static void main(String[] args){
        Portfolio portfolio = new Portfolio();

        portfolio.addStock(new Stock("AAPL", "Apple Inc.", 150.00, 0));
        portfolio.addStock(new Stock("GOOG", "Google Inc.", 2000.00, 0));

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("\nStock Market Simulator");
            System.out.println("1. View Portfolio");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. Simulate Price Change");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                portfolio.displayPortfolio();
                break;
                case 2:
                System.out.println("Enter stock symbol to buy: ");
                String symbol = scanner.next();
                System.out.println("Enter quantity to buy: ");
                int quantity = scanner.nextInt();
                Stock stockToBuy = findStockBySymbol(portfolio.getStocks(), symbol);
                if (stockToBuy != null){
                    portfolio.buyStock(stockToBuy, quantity);
                }
                else{
                    System.out.println("Stock not found in portfolio.");
                }
                break;
                case 3:
                System.out.println("Enter stock symbol to sell: ");
                symbol = scanner.next();
                System.out.println("Enter quantity to sell: ");
                quantity = scanner.nextInt();
                Stock stockToSell = findStockBySymbol(portfolio.getStocks(), symbol);
                if (stockToSell != null){
                    portfolio.sellStock(stockToSell, quantity);                 
                }
                else{
                    System.out.println("Stock not found in portfolio.");
                }
                break;
                case 4:
                System.out.println("Simulate price change functionality not yet implemented.");
                break;
                case 5:
                System.out.println("Exiting stock market simulator.");
                scanner.close();
                System.exit(0);
                default:
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
    public static <T extends Stock> Stock findStockBySymbol(List<T> stocks, String symbol){
    for(T stock : stocks){
        if(stock.getsymbol().equals(symbol)){
            return stock;
        }
    }
    return null;
    }
}
