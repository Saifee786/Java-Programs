//Implementation of abstraction
package OOPS;

import java.util.Scanner;

abstract class Softwares{
    String user_name;
    String password;
    void user_input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username");
        user_name = sc.nextLine();
        System.out.println("Enter Password");
        password = sc.nextLine();
    }
    void user_login(){
        System.out.println("WELCOME TO INSTAGRAM");
        System.out.println("-------------------------");
        System.out.println("Please Login Here...!!");
    }
    abstract void aap_open();

}
class Instagram extends Softwares{
    @Override
    void aap_open() {
        if(user_name.equals("Haidar") & password.equals("8980661175")){
            System.out.println("SuccessFully Login, App is Open...");

        }else{
            System.out.println("Invalid Username & password");
        }
    }
    void app_close(){
        System.out.println("App is Close....");
    }

}

public class Apps {
    public static void main(String[] args) {
        Instagram i = new Instagram();
        i.user_login();
        i.user_input();
        i.aap_open();
//      i.app_close();
    }
}