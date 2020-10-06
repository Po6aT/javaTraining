package com.bercut.oct;

public class HelloSpeakerMain {
    public static void main(String[] args) {
        HelloSpeaker speaker1 = new HelloSpeaker();
//        speaker1.name = "Sobachka"; - так делать плохо
        speaker1.setName("Gavrila");

        foo(speaker1);

        RussianSpeaker speaker2 = new RussianSpeaker();
        speaker2.setName("Бахча");
//        System.out.println(speaker2.getName());
        speaker2.hello();

    }
    static void foo(HelloSpeaker hs){
        hs.hello();
    }

}
