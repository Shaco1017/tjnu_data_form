package shaco.tjnu_data_form;

import shaco.tjnu_data_form.Util.JwtUtil;

public class tokentest {
    public static void main(String[] args) {
        System.out.println(JwtUtil.verifyAndGetUser("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoidXNlcjEiLCJkZXBhcnRtZW50X2lkIjoiSldDIiwidXNlcl9uYW1lIjoidGVzdDEiLCJ1c2VyX2FjY291bnQiOiJ0ZXN0MSIsInN0YXR1cyI6MSwiZXhwIjoxNzUwMTQ4ODg4fQ.hPHp2ESG3Or_mf2mq4N9b0BMMetDljIrzPSq2mHhGy8"));
    }
}
