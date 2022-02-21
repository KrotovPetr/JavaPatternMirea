package task6.FactoryMethod;

enum productType {
    small,
    big,
    huge
}

public class ConcreteProduct implements Product{

    public void constructor(){

        makeProduct();
        useProduct();
        outOfOrder();

    }

    @Override
    public void makeProduct() {
        System.out.println("We made product!");
    }

    @Override
    public void useProduct() {
        System.out.println("We use product!");
    }

    @Override
    public void outOfOrder() {
        System.out.println("We broke product!");
    }
}
