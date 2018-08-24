package com.qa.account;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world to the standard our");

        AccountService service = new AccountService();

        service.addAccountToMap(new Account("Joe", "Blogs", 1001));
        service.addAccountToMap(new Account("John", "Blags", 1002));


        System.out.println(service.toJsonObject());
    }
}
