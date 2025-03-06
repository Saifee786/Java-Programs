public class Encapsulation {  // Class name corrected
    private String name = "Saifee";

    public String getName() {  // Method name should follow camelCase properly
        return name;
    }
}

class Main {
    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();  // Updated class name
        System.out.println("Name is " + e.getName());  // Proper spacing
    }
}
