import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private List <Stock> stocks;

    public Portfolio(){
        this.stocks = new ArrayList<>();
    }
    
    public void addStock(Stock stock){
        this.stocks.add(stock);
    }

    public void buyStock(Stock stock, int quantity){
        stock.updateQuantity(quantity);
    }

    public void sellStock(Stock stock, int quantity){
        if(stock.getquantityOwned() >= quantity){
            stock.updateQuantity(-quantity);
        }
        else {
            System.out.println("Insufficient shares to sell for " + stock.getsymbol());
        }
    }

    public double getTotalValue(){
        double totalValue = 0;
        for (Stock stock: stocks){
            totalValue += stock.getcurrentPrice() * stock.getquantityOwned(); 
        }
        return totalValue;
    }

    public void displayPortfolio(){
        System.out.println("=== Portfolio ===");
        for (Stock stock : stocks){
            System.out.println("Symbol: " + stock.getsymbol() + ", Company: " + stock.getcompanyName());
            System.out.println("Quantity Owned: " + stock.getquantityOwned() + ", Current price: $" + stock.getcurrentPrice());
        }
        System.out.println("Total Portfolio Value: $" + getTotalValue());
    }

    public List<Stock> getStocks(){
        return new ArrayList<>(stocks);
    }
}
