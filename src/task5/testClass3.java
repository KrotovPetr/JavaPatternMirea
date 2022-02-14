package task5;
//Самая простая реализация.
//
//        Плюсы:
//        Простота и прозрачность кода
//
//        Потокобезопасность
//
//        Высокая производительность в многопоточной среде
//
//        Минусы:
//        Не ленивая инициализация.
public class testClass3 {
    private static final testClass3 INSTANCE = new testClass3();
    private testClass3(){
        System.out.println("Hello!");
    }
    public static testClass3 getInstance(){
        return INSTANCE;
    }
}
