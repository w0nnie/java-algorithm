package 스프링_입문을_위한_자바멀티_프로세스객체_지향의_원리와_이해.inheritance01;

public class Driver03 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];

        animals[0] = new Animal();
        animals[1] = new Mammalia();
        animals[2] = new Birds();
        animals[3] = new Whale();
        animals[4] = new Penguin();


        for (int i = 0; i < animals.length; i++) {
            animals[i].showMe();
        }
    }
}
