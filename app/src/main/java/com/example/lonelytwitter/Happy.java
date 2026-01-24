package com.example.lonelytwitter;

import java.util.Date;

public class Happy extends Mood{
    public Happy(Date date) {
        super(date);
    }

    public Happy() {
        super();
    }

    @Override
    public String getMoodType() {
        return "Happy";
    }
}
