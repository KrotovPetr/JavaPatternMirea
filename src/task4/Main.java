package task4;
//Thread.currentThread -
//Метод sleep() принимает в качестве параметра число миллисекунд, то есть то время, на которое необходимо «усыпить» поток.
// CurrentThread свойство для вывода сведений о потоке(идентификатор)
public class Main {
    public static void main(String[] args){
        testClass a = new testClass(2);
        Thread threadOne = new Thread(()->{
            System.out.println("Thread "+Thread.currentThread().getName()+" started");//информация о старте работы потока
            try{
                Thread.sleep(1000);//спит 1 секунду

            }catch(InterruptedException e){//при прерывании потока
                e.printStackTrace();
            }
            System.out.println("Thread "+Thread.currentThread().getName()+" finished");//информация о завершении потока
        });

        for (int i=0;i<5;i++){
           a.submit(threadOne);//запуск задачи
        }
        a.shutdown();//схлопывание потоков
    }
}
