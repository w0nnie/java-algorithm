package 스프링_입문을_위한_자바멀티_프로세스객체_지향의_원리와_이해.encapsulation01.packageOne;

public class ClassB {
    void runSomething() {
        ClassA classA = new ClassA();
        classA.def = 0;
        classA.pro = 0;
        classA.pub = 0;
    }

    static void runStaticThing() {
        ClassA classA = new ClassA();
        classA.def = 0;
        classA.pro = 0;
        classA.pub = 0;
    }
}
