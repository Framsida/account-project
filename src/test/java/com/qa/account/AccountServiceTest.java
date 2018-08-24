package com.qa.account;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountServiceTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void countFirstNameOccurrencesTest() {
        AccountService accountService = new AccountService();
        accountService.addAccountToMap(new Account("Josh", "Josh", 001));
        accountService.addAccountToMap(new Account("Josh", "Josh", 002));

        assertEquals(2, accountService.countFirstNameOccurences("Josh"));
    }


}
