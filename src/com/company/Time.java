package com.company;

public class Time {
    int hour, min, sec;
    Time(int seconds){
        this.hour = seconds / 3600;
        seconds %= 3600;
        this.min = seconds / 60;
        seconds %= 60;
        this.sec = seconds;
    }
    public String toString() {
        return hour + ":" + min + ":" + sec;
    }
}