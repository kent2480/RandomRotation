package com.app.kent.randomrotation;

/**
 * Created by Kent_Zheng on 2015/6/30.
 */


//   A    B    C    D    E    F
//   0   60  120  180  240  300
//   5   10   15   15   20   35
//   5   15   30   45   65  100
public enum Data {
    A(0),
    B(1),
    C(2),
    D(3),
    E(4),
    F(5);


    private final int value;

    private Data(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
