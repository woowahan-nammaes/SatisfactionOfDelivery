
package user;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserView {
    Scanner sc = new Scanner(System.in);

    public void printSignupTitle(){
        System.out.println("=================회원가입=================");
        System.out.println("회원가입을 진행합니다.\n아이디, 비밀번호, 닉네임, 주소, 전화번호가 필요해요.\n정보를 입력해주세요!");
        System.out.println("========================================");
    }

    public void printSigninTitle(){
        System.out.println("=============로그인=============");
        System.out.println("로그인을 진행합니다. 정보를 입력해주세요.");
        System.out.println("==============================");
    }

    public Map<UserInfoTitle, String> getSignupForm(){
        Map<UserInfoTitle, String> signupForm = new HashMap<>();
        UserInfoTitle[] signupInfoTitles = UserInfoTitle.values();
        int signupInfoIdx = 0;
        while(signupInfoIdx < signupInfoTitles.length) {
            System.out.print(signupInfoTitles[signupInfoIdx] + ": ");
            String signupInfo = sc.nextLine();
            if(isValid(signupInfo)) {
                signupForm.put(signupInfoTitles[signupInfoIdx], signupInfo);
                signupInfoIdx++;
            }
        }
        return signupForm;
    }

    public boolean isValid(String signupInfo){
        if(signupInfo.trim().isEmpty()) {
            System.out.println("정보를 입력해주세요.");
            return false;
        }
        return true;
    }

    public Map<UserInfoTitle, String> getSigninForm(){
        Map<UserInfoTitle, String> signinForm = new HashMap<>();
        UserInfoTitle[] signinInfoTitles = UserInfoTitle.values();
        for(int signinInfoIdx = 0; signinInfoIdx<signinInfoTitles.length; signinInfoIdx++){
            System.out.print(signinInfoTitles[signinInfoIdx] + ": ");
            String signinInfo = sc.nextLine();
            signinForm.put(signinInfoTitles[signinInfoIdx], signinInfo);
        }
        return signinForm;
    }

    public void printSuccessSignup(){
        System.out.println("회원가입이 되었습니다.\n우아한 배달의 남매가 되신 것을 환영합니다!\n");
    }

    public void printSuccessSignin(){
        System.out.println("배달의 남매에 오신 것을 환영합니다.\n");
    }
    public void printFailSignin(){
        System.out.println("아이디, 비밀번호가 잘못되었습니다.\n");
    }
    public void printSuccessLogout(){
        System.out.println("로그아웃 되었습니다.\n");
    }
    public void printFailLogout(){
        System.out.println("로그아웃 실패하였습니다.\n");
    }
}