package com.example.javastudy.ch18;

class LoginFailException extends Exception {
    public LoginFailException(String input, String msg) {
        super(msg + " : " + input);
    }
}

public class CustomExceptionTest {

    public boolean login(String id, String pass) throws LoginFailException {
        if (!"hong".equals(id)) {
            throw new LoginFailException(id, "아이디를 확인하세요");
        } else if (!"1234".equals(pass)) {
            throw new LoginFailException(pass, "비밀번호를 확인하세요");
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        CustomExceptionTest cet = new CustomExceptionTest();
        try {
            cet.login("jang", "1234");
        } catch (LoginFailException e) {
            e.printStackTrace();
        }
    }

}
