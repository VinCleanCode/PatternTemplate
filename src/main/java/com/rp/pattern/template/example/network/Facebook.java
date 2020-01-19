package com.rp.pattern.template.example.network;

public class Facebook extends Network {
    public Facebook(String username, String password) {


    }

    @Override
    protected void logOut() {

    }

    @Override
    protected boolean sendData(byte[] bytes) {
        return false;
    }

    @Override
    protected boolean logIn(String username, String password) {
        return false;
    }
}
