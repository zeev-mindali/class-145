package class4_0411;

public class User {
    private String uName = "Hong";
    private String uPassword = "1234";
    private boolean isLogged = false;

    public boolean login(String name, String password) {
        return name.equals(uName) && password.equals(uPassword);
    }

    //getter -> לקבל מידע מהמחלקה
    //setter -> לעדכן מידע במחלקה
    public void setLogin(boolean login) {
        isLogged = login;
    }


}
