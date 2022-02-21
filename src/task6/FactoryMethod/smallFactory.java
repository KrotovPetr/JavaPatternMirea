package task6.FactoryMethod;

public class smallFactory {
    private ConcreteProduct myProduct;
    public  smallFactory (ConcreteProduct myProduct){
        this.myProduct = myProduct;
    }
    public void makeProduct(ConcreteProduct prod){
       myProduct.constructor();
    }

}
