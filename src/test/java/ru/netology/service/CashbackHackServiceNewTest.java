package ru.netology.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceNewTest {

    @Test
    public void shouldCalcCashbackLow() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCalcCashbackHigh() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCalcCashbackZero() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }



}
