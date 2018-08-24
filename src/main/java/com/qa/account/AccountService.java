package com.qa.account;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class AccountService {
    private Map<Integer, Account> accountMap;
    private int counter = 1;

    public AccountService() {
        accountMap = new HashMap<Integer, Account>();
    }

    public int addAccountToMap(Account accountToAdd) {
        this.accountMap.put(counter, accountToAdd);
        return counter++;
    }

    public void getAccountById(int idOfAccount) {
        this.accountMap.get(idOfAccount);
    }

    public JSONObject toJsonObject(){
        JSONObject json = new JSONObject();

        accountMap.forEach((k,v) -> {
            json.put(k.toString(), v.toMap());
        });

        return json;
    }
    public int countFirstNameOccurences(String firstName) {
        AtomicInteger counter = new AtomicInteger(0);
        accountMap.forEach((k,v) -> { if(v.getFirstName().equals(firstName)) counter.incrementAndGet(); });
        return counter.get();
    }
}