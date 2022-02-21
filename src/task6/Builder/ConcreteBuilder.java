package task6.Builder;

public class ConcreteBuilder extends IntBuilder{
    @Override
    public void setName() {
        builder.setName("chair");
    }

    @Override
    public void setPrice() {
        builder.setPrice(2000);
    }

    @Override
    public void setAge() {
        builder.setAge(13);
    }
}

