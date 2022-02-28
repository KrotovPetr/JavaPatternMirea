package task8.Handler;

public class EmailLogger extends Handler {
    public EmailLogger(String info){
        this.info=info;

    }
    @Override
    protected void getAccess() {
        System.out.println("You've got access to your email");
    }

    @Override
    protected void getExit() {
        System.out.println("You've left your email");
    }
}
