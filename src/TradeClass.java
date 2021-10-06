public class TradeClass {
    public static void main(String[] args){
        Trade trade1 = new Trade("IBMx211", "IBM", 240);
        Trade trade2 =  new Trade("IBMx113","IBM",235,360.50);

        System.out.println(trade2.toString());

    }
}
