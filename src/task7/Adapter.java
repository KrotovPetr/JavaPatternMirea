package task7;

public class Adapter implements Product {
    private Employee emp;
    public Adapter(Employee emp){
        this.emp = emp;
    }
    @Override
        public void getNameofProduct() {
        this.emp.getEmployee();

    }
}
