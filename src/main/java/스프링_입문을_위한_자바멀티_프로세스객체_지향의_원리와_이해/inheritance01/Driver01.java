package 스프링_입문을_위한_자바멀티_프로세스객체_지향의_원리와_이해.inheritance01;

public class Driver01 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Mammalia mammalia = new Mammalia();
        Birds birds = new Birds();
        Whale whale = new Whale();
        Penguin penguin = new Penguin();


        animal.showMe();
        mammalia.showMe();
        birds.showMe();
        whale.showMe();
        penguin.showMe();
    }
}
