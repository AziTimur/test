package com.geek.lesson4by34;

public class Music {
    private int number;
    private String name;
    private String singer;
    private String time;

    public Music(int number, String name, String singer, String time) {
        this.number = number;
        this.name = name;
        this.singer = singer;
        this.time = time;
    }

    public String getTime() {
        return time;
    }



    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
}
