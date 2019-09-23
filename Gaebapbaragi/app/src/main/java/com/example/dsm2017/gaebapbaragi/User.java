package com.example.dsm2017.gaebapbaragi;

public class User {
    int serial;
    String id;
    String pw;

    public User(){

    }

    @Override
    public String toString() {
        return "User{" +
                "serial='" + serial + '\'' +
                ", id=" + id +
                ", pw='" + pw + '\'' +
                '}';
    }

    public User(int serial, String id, String pw) {
        this.serial = serial;
        this.id = id;
        this.pw = pw;
    }

    private String token;

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

}
