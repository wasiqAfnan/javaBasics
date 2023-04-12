class Base{
    private int id;
    public void setId(int x){
        id = x;
    }

    public int getId(){
        return id;
    }

}

 // inherit from base class using 'extends' keyword
class Derieved extends Base{
    private int salary;
    public void setSalary(int x){
        salary = x;
    }

    public int getSalary(){
        return salary;
    }
}
public class oop4_Inheritence_basic {
    public static void main(String[] args){
        Derieved obj1 = new Derieved();
        obj1.setId(1001);
        int id = obj1.getId();
        obj1.setSalary(5000);
        int salary = obj1.getSalary();

        System.out.println(id + "\n" + salary);
    }
}
