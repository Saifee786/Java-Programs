package mypackage;

public class Company { }

class emp1 extends Company { }

class emp2 extends Company { }

class Main {
    public static void main(String[] args) {
        emp2 e = new emp2();

        if (e instanceof emp2) {
            System.out.println("Instance of emp2");
        }
        if (e instanceof Company) {
            System.out.println("Instance of company");
        }
    }
}

