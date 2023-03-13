package 스프링_입문을_위한_자바멀티_프로세스객체_지향의_원리와_이해.inheritance02;

public class Penguin extends Birds implements Swim {

    Penguin() {
        myClass = "펭귄";
    }

    @Override
    public void swim() {
        System.out.println(myClass + " 수영하다.");
    }
}
