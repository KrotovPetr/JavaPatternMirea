package task6.Builder;


public class Director {
    private IntBuilder dirBuilder;
    public void setDirBuilder(IntBuilder obj){
        dirBuilder=obj;
    }
    public builder getObject() { return dirBuilder.getBuilder();}
    public void createNewBuilder(){
        dirBuilder.createNewBuilder();
        dirBuilder.setAge();
        dirBuilder.setName();
        dirBuilder.setPrice();
    }
}
