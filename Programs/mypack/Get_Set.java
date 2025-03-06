package Programs.mypack;

class raza{
    private int id;
    private String name;
    private int salary;
    private String add;
    private String phone;


    public Void getDetail(){
        System.out.println("Emplopyee Id"+id);
        System.out.println("Emplopyee Id"+name);
        System.out.println("Emplopyee Id"+salary);
        System.out.println("Emplopyee Id"+add);
        System.out.println("Emplopyee Id"+phone); 
        return false;  
    }
    public void setDetail(int id,String name,int salary,String add,String phone){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.add = add;
        this.phone = phone;

    } 
}

public class Get_Set{
    public static void main(String args[]){
        raza obj = new raza();
        obj.setDetail(101,"Ali",450505,"Mumbai","45678987");
        System.out.println(obj.getDetail());
    }
}





