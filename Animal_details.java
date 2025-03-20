package mypackage;

public class Animal_details {
    Animal_details(String Cat_name, String Cat_breed, Integer Cat_Price){
        System.out.println("Name : " + Cat_name + "\n" +  "Breed : " + Cat_breed +"\n" + "Price : " + Cat_Price);

    }

    public static void main(String[] args) {
        Animal_details anm = new Animal_details("Kiki","Cyberian",25000);
    }
}
