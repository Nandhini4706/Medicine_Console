package Model;

import javax.swing.plaf.synth.SynthMenuBarUI;

public class User {
    public int UserId;
    public String UserName;
    public int age;
    public String Symptoms;
    public String Days;

    public User(int UserId,String UserName, int age, String Symptoms, String Days) {
        this.UserId = UserId;
        this.UserName = UserName;
        this.age = age;
        this.Symptoms = Symptoms;
        this.Days = Days;
    }

    public void display(){
        System.out.println("---------------------------------");
        System.out.println("User Id " + UserId);
        System.out.println("User Name " + UserName);
        System.out.println("User Age " + age);
        System.out.println("User Symptoms " + Symptoms);
        System.out.println("User How many Days " + Days);
        System.out.println("---------------------------------");


    }
}
