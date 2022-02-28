package task7;

import task7.Bridge.Functions;
import task7.Bridge.Tv;
import task7.Bridge.advancedFunctions;

public class Main {
    public static void main(String[] args){
        Product a = new Adapter(new Employee());
        a.getNameofProduct();
//        concreteProduct b = new Client(new myClient );
        Tv tv = new Tv();
        advancedFunctions b= new advancedFunctions(tv);
        b.volumeUp();
        b.volumeDown();
        b.mute();

    }
}
