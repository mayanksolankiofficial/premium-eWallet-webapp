package com.ewallet.demo.Model;

public class User {

    private int id;
    private String name;
    private String email;
    private String mobile;
    private Boolean kyc_enabled;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Boolean getKyc_enabled() {
        return kyc_enabled;
    }

    public void setKyc_enabled(Boolean kyc_enabled) {
        this.kyc_enabled = kyc_enabled;
    }
}