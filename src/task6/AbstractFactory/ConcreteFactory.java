package task6.AbstractFactory;

public class ConcreteFactory implements abstractFactory{
    @Override
    public void createProductA() {
        ConcreteProduct a = new ConcreteProduct();
        a.sayHello();
    }

    @Override
    public void createProductB() {
        ConcreteProduct b = new ConcreteProduct();
        b.sayHello();
    }
}
