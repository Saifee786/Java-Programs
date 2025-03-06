public class encps {  // Class name corrected
    private String name = "Saifee";
    private int id ;

    public String getname() {  // Method name should follow camelCase properly
        return name;
    }
    public String getid(){
        return name;
    }
    





}

class Main {
    public static void main(String[] args) {
        encps e = new encps();  // Updated class name
        System.out.println("Name is " + e.getName());  // Proper spacing
    }
}
