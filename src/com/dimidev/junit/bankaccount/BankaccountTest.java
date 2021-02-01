package com.dimidev.junit.bankaccount;

import static org.junit.Assert.*;

import com.dimidev.junit.bankaccount.Bankaccount;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BankaccountTest {

    private Bankaccount account;

    @Before
    public void setupBankaccountBeforeEachTest() {
        account = new Bankaccount(1, 100);
    }

//    @After
//    public void eraseBankaccountAfterEachTest() {
//        account = null; // not necessary in this example, but useful in other cases
//    }

    @Test
    public void testDeposite() {
//        Bankaccount account = new Bankaccount(1, 100);
        account.deposit(200);
        assertEquals(300, account.getBalance(), 0);
    }

    @Test
    public void testWithdrawal() {
//        Bankaccount account = new Bankaccount(1, 100);
        account.withdrawl(50);
        assertEquals(50, account.getBalance(), 0);
    }

}