package task8;

import task8.Handler.EmailLogger;
import task8.Handler.Handler;
import task8.Handler.Logger;
import java.util.ArrayList;
import java.util.List;

interface Command{
    void execute();
}

class Receiver {
    public List<Command> commands = new ArrayList<Command>();
    void addCommand(Command command){
        commands.add(command);
    }
    void runCommand() {
        try {
            for (Command command : commands) {
                command.execute();
            }

        } catch (Exception e){
            System.out.println("Ошибка!");
        }
    }
}

class mousePress implements Command{
    @Override
    public void execute() {
        System.out.println("The mouse was pressed!");
    }
}

class mouseClick implements Command{
    @Override
    public void execute() {
        System.out.println("The mouse was clicked!");
    }
}

public class Main {
    public static void main(String[] args){
        Handler hand1, hand2;
        hand1 = new Logger("String");
        hand2 = hand1.setNext(new EmailLogger(Handler.info));

        hand1.getInfo("Entering function y.", Handler.info);

        hand2.getInfo("Step1 completed.", Handler.info);

    }
    Receiver rec = new Receiver();
    rec.addCommand(new mouseClick());
    rec.addCommand(new mousePress());
    rec.runCommand();
}
