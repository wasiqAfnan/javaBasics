// abstract class
abstract class Player {

    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // abstract method
    public abstract void play();
}

class Cricketer extends Player {
    Cricketer(String name) {
        setName(name);
    }

    // implementing abstrcat class
    @Override
    public void play() {
        System.out.println("The player name is:" + name);
    }
}

public class oop8_Abstract_class {
    public static void main(String[] args) {
        Cricketer obj = new Cricketer("Afnan");
        obj.play();
    }
}
