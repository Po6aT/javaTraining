package com.bercut.oct;

public class RussianSpeaker extends HelloSpeaker{
    @Override
    void hello() {

        System.out.println("ты пёс, а я " + getName());
    }
}
