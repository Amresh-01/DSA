
public class class_and_object {

    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);

        BankAcccount myAcccount = new BankAcccount();
        myAcccount.Username = "Amreshchaurasiya";
        myAcccount.setPassword = "@123amresh";
    }
}

class BankAcccount {

    public String Username;
    private String Password;

    public void setPassword(String pwd) {
        Password = pwd;
    }
}

class Pen {

    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(String newTip) {
        color = newTip;
    }
}
