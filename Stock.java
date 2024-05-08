public class Stock {
    
private String symbol;
private String companyName;
private Double currentPrice;
private int quantityOwned;

public Stock(String symbol, String companyName, Double currentPrice, int quantityOwned){
this.symbol = symbol;
this.companyName = companyName;
this.currentPrice = currentPrice;
this.quantityOwned = 0;
}

public String getsymbol(){
    return symbol;
}
public String getcompanyName(){
    return companyName;
}
public double getcurrentPrice(){
    return currentPrice;
}
public int getquantityOwned(){
    return quantityOwned;
}
public void simulatePriceChange(double minChange, double maxChange){
    double change = Math.random() * (maxChange - minChange) + minChange;
    this.currentPrice += change;
}
public void updateQuantity(int change){
    this.quantityOwned += change;
}






























}
