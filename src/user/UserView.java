package user;

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

    public String[] getSignupForm(){
        String[] signupInfoTitles = {"아이디", "비밀번호", "닉네임", "주소", "전화번호"};
        String[] signupInfos = new String[5];
        int signupInfosIdx = 0;
        while(signupInfosIdx < 5){
            System.out.print(signupInfoTitles[signupInfosIdx] + ": ");
            String signupInfo = sc.nextLine();
            if(isValid(signupInfo)) {
                signupInfos[signupInfosIdx] = signupInfo;
                signupInfosIdx++;
            }
        }
        return signupInfos;
    }

    public boolean isValid(String signupInfo){
        if(signupInfo.isEmpty()) {
            System.out.println("정보를 입력해주세요.");
            return false;
        }
        return true;
    }

    public String[] getSigninForm(){
        String[] signinInfoTitles = {"아이디", "비밀번호"};
        String[] signinInfos = new String[2];

        for(int signinInfoIdx = 0; signinInfoIdx<signinInfos.length; signinInfoIdx++){
            System.out.print(signinInfoTitles[signinInfoIdx] + ": ");
            signinInfos[signinInfoIdx] = sc.nextLine();
        }
        return signinInfos;
    }

    public void printSuccessSignup(){
        System.out.println("회원가입이 되었습니다.\n우아한 배달의 남매가 되신 것을 환영합니다!\n");
    }

    public void printSuccessSignup(){
        System.out.println("배달의 남매에 오신 것을 환영합니다.");
    }
