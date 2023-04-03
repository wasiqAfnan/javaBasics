// class
class MyClass{
    private int x;
    public void setData(int a){
        x = a;
    }
    public int getData(){
        return x;
    }
}

public class oop1_classes_and_objects{
    public static void main(String[] args){
        int res;
        MyClass obj = new MyClass(); // creating object of myclass 
        obj.setData(5);
        res = obj.getData();
        System.out.println(res);
    }
}
