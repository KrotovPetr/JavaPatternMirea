package task6.Builder;

abstract class IntBuilder {
    public task6.Builder.builder builder;
    public task6.Builder.builder getBuilder() {return this.builder;};
    public void createNewBuilder() { this.builder = new builder(); }
    public abstract void setName();
    public abstract void setPrice();
    public abstract void setAge();
}
