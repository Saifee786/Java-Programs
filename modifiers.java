class Modi{
    public int a =100;
    protected int b = 200;
    private String name = "Saifee";
}
public class modifiers {
    public int a =100;
    protected int b  =200;
    int c = 400;

    private String name = "Saifee raza";
    public static void main(String[] args) {
        modifiers obj = new modifiers();
        System.out.println("a Value is::"+obj.a);
        System.out.println("b Value is::"+obj.b);
        System.out.println("c Value is::"+obj.c );
        System.out.println("Name::"+obj.name);

        Modi m = new Modi();
        System.out.println("a value is :"+m.a);
        System.out.println("b is value is :"+m.b);
//        System.out.println("My name is::"+m.name); Error name has private acces in modi
    }
}