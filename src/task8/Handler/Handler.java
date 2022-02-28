package task8.Handler;

public abstract class Handler {
    public static String info;
    private Handler nextHandler;
    protected abstract void getAccess();
    protected abstract void getExit();
    public Handler setNext(EmailLogger log) {
        nextHandler = log;
        return log;
    }
    public void getInfo(String str, String str2){

        if (nextHandler != null) {
            System.out.println("Go to next block!");
            nextHandler.getInfo(str, str2);
        }
        else {
            System.out.println(str + "  " + str2);
        }
    }
}
