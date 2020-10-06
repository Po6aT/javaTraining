package com.bercut.oct;

public class HelloSpeaker {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void hello() {
        System.out.println("Hello. I am " + name);
    }
}
