package task6.Copyable;


public class ConcretePrototype1 implements Copyable {
    String name;
    int weight;
    int size;
    String color;
    public ConcretePrototype1(int size, int weight, String color, String name){
        this.color=color;
        this.name=name;
        this.weight =weight;
        this.size = size;
    }
    public void getString(){
        System.out.println(this.size+"  "+this.weight + " " +this.color + " "+ this.name);
    }
    @Override
    public Object copy() {
        ConcretePrototype1 copy = new ConcretePrototype1(size, weight, color, name);
        return copy;
    }
}
