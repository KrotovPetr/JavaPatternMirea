package task3;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Semaphore;

public class MapWithSynchronized {
    public MapWithSynchronized(){
        Map<Integer, String> map = new HashMap<>();
        CommonResource ex1 = new CommonResource();
        new Thread(new CountThread(map, ex1)).start();
        new Thread(new CountThread(map, ex1)).start();
        new Thread(new CountThread(map, ex1)).start();
    }
}

class CommonResource{

    int x;
    synchronized void increment(){
        x=1;
        for (int i = 1; i < 5; i++){
            System.out.printf("%s %d \n", Thread.currentThread().getName(), x);
            x++;
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){}
        }
    }
}

class CountThread implements Runnable{
    Map<Integer, String> map;
    CommonResource res;
    CountThread(Map<Integer, String> map, CommonResource res){
        this.res=res;
        this.map=map;

    }

    public void run(){
        res.increment();
    }
}