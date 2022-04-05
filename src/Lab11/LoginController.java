package Lab11;

public class LoginController {
    public static void main(String[] args) {
        LoginPage loginEx = new ExternalLoginPage();
        loginEx.performLogin();
        LoginPage loginIn = new InternalLoginPage();
        loginIn.performLogin();
    }
}
