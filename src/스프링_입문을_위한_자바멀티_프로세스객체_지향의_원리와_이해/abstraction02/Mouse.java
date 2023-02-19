package 스프링_입문을_위한_자바멀티_프로세스객체_지향의_원리와_이해.abstraction02;

public class Mouse {
    public String name;
    public int age;
    public static int countOfTail = 1;

    public void sing() {
        System.out.println(name + "찍찍!!");
    }
}
