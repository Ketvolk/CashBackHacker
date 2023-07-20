package ru.netology;

import org.junit.Assert;

public class CashbackHackServiceTest {
    CashbackHackService cashbackService = new CashbackHackService();

    @org.junit.Test
    public void AmountLessThen1000Test() {
        Assert.assertEquals(100, cashbackService.remain(900));
    }

    @org.junit.Test
    public void AmountIsNull() {
        Assert.assertEquals(1000, cashbackService.remain(0));
    }

    @org.junit.Test
    public void AmountIsNegative() {
        Assert.assertEquals(1100, cashbackService.remain(-100));
    }

    @org.junit.Test
    public void AmountIs1000() {
        Assert.assertEquals(0, cashbackService.remain(1000));
    }
}