package 스프링_입문을_위한_자바멀티_프로세스객체_지향의_원리와_이해.inheritance01;

public class Driver02 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal mammalia = new Mammalia();
        Animal birds = new Birds();
        Animal whale = new Whale();
        Animal penguin = new Penguin();


        animal.showMe();
        mammalia.showMe();
        birds.showMe();
        whale.showMe();
        penguin.showMe();
    }
}
