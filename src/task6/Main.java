package task6;

import task6.AbstractFactory.ConcreteFactory;
import task6.Builder.ConcreteBuilder;
import task6.Builder.Director;
import task6.Copyable.Client;
import task6.Copyable.ConcretePrototype1;
import task6.FactoryMethod.*;

public class Main {
    public static void main(String[] args){

        Client original = new Client("Vasya",18);
        Client copy = (Client)original.copy();
        original.getString();
        copy.getString();
        ConcretePrototype1 orig = new ConcretePrototype1(12,14, "blue","chair");
        ConcretePrototype1 copy2 = (ConcretePrototype1) orig.copy();
        orig.getString();
        copy2.getString();
        Director director = new Director();
        ConcreteBuilder concProt = new ConcreteBuilder();
        director.setDirBuilder(concProt);
        director.createNewBuilder();
        System.out.println(director.getObject());
        ConcreteFactory a = new ConcreteFactory();
        a.createProductA();
        a.createProductB();
//        ConcreteFactory x = null;
//        smallFactory a2 = new smallFactory(x);
//        a2.makeProduct(x);
        SimpleCoffeeFactory a12 = new SimpleCoffeeFactory();
        CoffeeShop a13 = new CoffeeShop(a12);
    }
}

