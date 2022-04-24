package EmailApp;

public class Email {
    private String email;
    private String password;
    private int boxCap;
    private String name;
    private String department;

    public Email(){

    }

    public void setAltEmail(String newEmail){
        email = newEmail;
    }

    private void Department(String email){
        department = email.substring(email.indexOf("@") + 1);
        department = department.substring(0, department.indexOf("."));
    }

    public void setBoxCap(int newCap){
        boxCap = newCap;
    }

    public void setPassword(String newPass){
        password = newPass;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public int getBoxCap(){
        return boxCap;
    }
}
