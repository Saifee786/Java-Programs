package mypackage;

public class Constructor_example {
    Constructor_example(){
        System.out.println("Inside constructor");
    }

    Constructor_example(String Name) {
        System.out.println("Inside of Constructor1 = " + Name);
    }
}

class main{
    public static void main(String[] args) {
        Constructor_example obj = new Constructor_example();
        Constructor_example obj1 = new Constructor_example("Saifee raza");
    }
}

