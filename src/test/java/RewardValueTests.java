import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        var rewardCash2_miles = new RewardValue(cashValue);
        int milesExcepted = (int)(cashValue/0.0035);
        assertEquals(milesExcepted,rewardCash2_miles.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 500;
        var rewardMiles2_Cash = new RewardValue(milesValue);
        double cashExcepted = (milesValue * 0.0035);
        assertEquals(cashExcepted,rewardMiles2_Cash.getCashValue() );
    }
}
