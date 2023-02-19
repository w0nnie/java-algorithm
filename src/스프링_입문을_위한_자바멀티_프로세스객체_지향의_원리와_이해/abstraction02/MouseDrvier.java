package 스프링_입문을_위한_자바멀티_프로세스객체_지향의_원리와_이해.abstraction02;

public class MouseDrvier {
    public static void main(String[] args) {
        Mouse.countOfTail = 1;

        Mouse mickey = new Mouse();
        Mouse jerry = new Mouse();
        Mouse mightyMouse = new Mouse();


        System.out.println(mickey.countOfTail);
        System.out.println(jerry.countOfTail);
        System.out.println(mightyMouse.countOfTail);

        System.out.println(Mouse.countOfTail);
    }
}
