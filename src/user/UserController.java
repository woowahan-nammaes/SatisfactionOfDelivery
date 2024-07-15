package user;

import java.util.Map;

public class UserController {
    UserView userView = new UserView();
    UserService userService = new UserService();

    public void signUp(){
        userView.printSignupTitle();
        Map<UserInfoTitle, String> signupForm = userView.getSignupForm();
        userService.signUp(
                signupForm.get(UserInfoTitle.LOGINID),
                signupForm.get(UserInfoTitle.PASSWORD),
                signupForm.get(UserInfoTitle.NAME),
                signupForm.get(UserInfoTitle.ADDRESS),
                signupForm.get(UserInfoTitle.PHONENUMBER));
        userView.printSuccessSignup();
    }

    public User signIn(){
        userView.printSigninTitle();
        Map<UserInfoTitle, String> signinForm = userView.getSigninForm();
        User tmpUser = userService.signIn(
                signinForm.get(UserInfoTitle.LOGINID),
                signinForm.get(UserInfoTitle.PASSWORD));
        if(tmpUser==null){
            userView.printFailSignin();
            return null;
        }else{
            userView.printSuccessSignin();
            return tmpUser;
        }
    }

    public User signOut(String loginId){
        User tmpUser = userService.signOut(loginId);
        if(tmpUser==null){
            userView.printFailLogout();
            return null;
        }else{
            userView.printSuccessLogout();
            return tmpUser;
        }
    }
}