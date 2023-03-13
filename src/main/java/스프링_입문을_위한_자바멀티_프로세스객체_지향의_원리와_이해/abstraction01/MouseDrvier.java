package 스프링_입문을_위한_자바멀티_프로세스객체_지향의_원리와_이해.abstraction01;

public class MouseDrvier {
    public static void main(String[] args) {
        Mouse mickey = new Mouse();
        mickey.name = "미키";
        mickey.age = 85;
        mickey.countOfTail = 1;

        mickey.sing();

        mickey = null;

        Mouse jerry = new Mouse();
        jerry.name = "제리";
        jerry.age = 73;
        jerry.countOfTail = 1;

        jerry.sing();
    }
}
