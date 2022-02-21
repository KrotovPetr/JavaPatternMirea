package task6.AbstractFactory;

public class ConcreteProduct implements AbstractProduct{
    @Override
    public void sayHello() {
        System.out.println("Hello!");
    }
}
