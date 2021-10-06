public class Trader {
    private String name;
    private Account account = new Account();

    public Account getAccount() {
        return account;
    }

    public void addTrade(Trade trade) {
        double tradeValue = trade.getPrice() * trade.getQuantity();
        account.setTotal_value(tradeValue + account.getTotal_value());
    }
}
