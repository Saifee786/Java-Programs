package mypackage;

class Engine {  // Parent class
  void start() {
    System.out.println("Engine is starting..");
  }

  void moving() {
    System.out.println("Engine is moving..");
  }
}

class Car {  // Child class
  Engine e = new Engine();

  void stop() {
    System.out.println("Engine is stopping..");
  }

  void moving() {
    System.out.println("Car is moving..");
    e.moving();
  }
}

public class Composition {
  public static void main(String[] args) {
    Car c = new Car();
    c.stop();
    c.moving();
  }
}
