package mypackage;

class emp{
    private int Emp_id = 101;
    private String Emp_Name = "Raza";
    private int Salary = 70000;
    private String Add = "church street";
    private String Phone;

    public String getPhone(){
        return Phone;
    }

    public void setPhone(String Phone){
        this.Phone = Phone;
    }

}


public class emp_details {
    public static void main(String[] args) {
        emp ex = new emp();
        ex.setPhone("897451654");
        System.out.println(ex.getPhone());
    }

}
