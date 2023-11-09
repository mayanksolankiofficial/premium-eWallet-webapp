package com.ewallet.demo.Model;

import com.sun.istack.NotNull;

public class AddBalanceDetails {

    private int userid;

    private int amount;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}