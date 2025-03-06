public class staticMethod{
  static int a = 100;
  int b = 200;
  public static void main(String args[]){
    System.out.println("a value :"+a);
    staticMethod m = new staticMethod();
    System.out.println("b value:"+m.b);
  }
}