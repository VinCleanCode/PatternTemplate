package com.rp.pattern.template.example.network;

public abstract class Network {
    String username;
    String password;

    Network() {}

    public boolean post(String message) {
        if(logIn(this.username, this.password)){
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    protected abstract void logOut();

    protected abstract boolean sendData(byte[] bytes);

    protected abstract boolean logIn(String username, String password);
}
