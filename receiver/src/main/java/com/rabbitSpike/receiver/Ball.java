package com.rabbitSpike.receiver;

import java.io.Serializable;

public class Ball {
    private String color;
    private Integer size;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}