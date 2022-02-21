package task6.Copyable;

public class Client implements Copyable {
    int age;
    String name;
    public Client(String name, int age){
        this.age =age;
        this.name=name;
    }
    public void getString(){
        System.out.println(this.age + " " + this.name);
    }
    @Override
    public Object copy() {
        Client copy = new Client(name, age);
        return copy;
    }
}
