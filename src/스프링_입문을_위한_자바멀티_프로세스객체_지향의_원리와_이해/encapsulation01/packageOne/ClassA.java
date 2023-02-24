package 스프링_입문을_위한_자바멀티_프로세스객체_지향의_원리와_이해.encapsulation01.packageOne;

public class ClassA {
    private int pri;
    int def;
    protected int pro;
    public int pub;

    void runSomething() {
        System.out.println(pri);
        System.out.println(def);
        System.out.println(pro);
        System.out.println(pub);
    }

    static void runStaticThing() {

    }

    public static void main(String[] args) {
        ClassA a = new ClassA();

        a.pri = 1;
        a.runSomething();
    }
}
