package mypackage;

public class Encapsulation {  
    private String name = "Saifee";

    public String getName() {  
        return name;
    }

    public static void main(String[] args) {  // Move main method inside Encapsulation class
        Encapsulation e = new Encapsulation();  
        System.out.println("Name is " + e.getName());  
    }
}
