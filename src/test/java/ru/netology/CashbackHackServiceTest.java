package ru.netology;

import org.testng.Assert;

public class CashbackHackServiceTest {
    CashbackHackService cashbackService = new CashbackHackService();

    @org.testng.annotations.Test
    public void AmountLessThen1000Test() {
        Assert.assertEquals(cashbackService.remain(900), 100);
    }
    @org.testng.annotations.Test
    public void AmountIsNull() {
        Assert.assertEquals(cashbackService.remain(0), 1000);
    }

    @org.testng.annotations.Test
    public void AmountIsNegative() {
        Assert.assertEquals(cashbackService.remain(-100), 1100);
    }

    @org.testng.annotations.Test
    public void AmountIs1000() {
        Assert.assertEquals(cashbackService.remain(1000), 0);
    }
}
