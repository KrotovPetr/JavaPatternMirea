package task5;
//Плюсы:
//Ленивая инициализация.
//
//Потокобезопасность
//
//Минусы:
//Низкая производительность в многопоточной среде
public class testClass1 {
    private testClass1(){
        System.out.println("Hello!");
    }
    private static testClass1 INSTANCE;
    public static synchronized testClass1 getInstance(){
        if (INSTANCE == null) {
            INSTANCE = new testClass1();
        }
        return INSTANCE;
    }
}
