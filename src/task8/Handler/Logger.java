package task8.Handler;

public class Logger extends Handler {
    public Logger(String Info){
        this.info=Info;
    }
    @Override
    protected void getAccess() {
        System.out.println("You've got access to your account");
    }

    @Override
    protected void getExit() {
        System.out.println("You've left your account");
    }

}
