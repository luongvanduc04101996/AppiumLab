package Lab11;

public abstract class LoginPage {
    protected ILogin login;

    public void performLogin() {
        login.login();
    }
}
