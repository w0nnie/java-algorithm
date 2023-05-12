package Thread;

public class Thread_example implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

class Thread_example1 extends Thread {
    @Override
    public void run() {
        System.out.println(super.getName());
    }
}


class main {
    public static void main(String[] args) {
        Thread_example1 t1 = new Thread_example1();

        Runnable r = new Thread_example();
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
    }
}


