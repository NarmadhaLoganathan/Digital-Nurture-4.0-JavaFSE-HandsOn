
//WebApp.java
public class WebApp implements Observer {
    private String name;

    public WebApp(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println(name + " web app updated: " + stockName + " is now $" + price);
    }
}
