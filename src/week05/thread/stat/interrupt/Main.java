package week05.thread.stat.interrupt;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("task : " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(task, "Thread");
        thread.start();

        thread.interrupt(); //sleep을 방해하고 다시 실행대기 상태로 돌아가 catch 문으로 빠짐

        System.out.println("thread.isInterrupted() = " + thread.isInterrupted());

    }
}