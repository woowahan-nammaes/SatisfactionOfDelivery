package user;

public class UserController {
}
    UserView userView = new UserView();
    UserService userService = new UserService();

    public void signUp(){
        userView.printSignupTitle();
        String[] signupInfos = userView.getSignupForm();
        userService.signUp(signupInfos[0], signupInfos[1], signupInfos[2], signupInfos[3], signupInfos[4]);
        userView.printSuccessSignup();
    }

