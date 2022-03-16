package task3;
import java.util.ArrayList;

import java.util.concurrent.Semaphore;




public class ListWithSemaphore {
    public ListWithSemaphore(){
        Semaphore mySem = new Semaphore(1);
        ArrayList<Integer> list1 =  new ArrayList<>();
        new Thread(new threadClass(list1, mySem, "Поток 1")).start();
        new Thread(new threadClass(list1, mySem, "Поток 2")).start();
        new Thread(new threadClass(list1, mySem, "Поток 3")).start();
    }
}



class threadClass implements Runnable{
    ArrayList<Integer> list1;
    Semaphore sem;
    String name;

    public threadClass(ArrayList<Integer> list1, Semaphore sem, String name) {
        this.list1 = list1;
        this.sem = sem;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " ожидает разрешение");
            sem.acquire();
            System.out.println(name + " работает");
            for (int i = 0; i < 15; i++) {
                list1.add(i);
                Thread.sleep(150);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " освобождает");
        sem.release();


    }
}