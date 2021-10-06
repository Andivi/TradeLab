import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TraderTest {
    @Test
    void testAddTrade(){
        Trader trader = new Trader();
        Trade trade = new Trade("IDD","IDD",5,10.0);
        trader.addTrade(trade);
        assertEquals(trader.getAccount().getTotal_value(), 50.0);
    }
}