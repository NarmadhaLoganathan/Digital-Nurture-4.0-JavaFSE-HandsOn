//Observertest.java
public class ObserverTest {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobile = new MobileApp("Narmadha's Phone");
        Observer web = new WebApp("StockWatch");

        market.register(mobile);
        market.register(web);

        market.setStock("TCS", 3520.75);
        market.setStock("INFY", 1423.50);
    }
}
