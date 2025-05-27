public class ThreadCreationExample extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " is running.");
        }
    }
    
    public static void main(String[] args) {
        ThreadCreationExample t1 = new ThreadCreationExample();
        ThreadCreationExample t2 = new ThreadCreationExample();
        t1.start();
        t2.start();
    }
}