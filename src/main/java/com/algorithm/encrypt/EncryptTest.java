package com.algorithm.encrypt;

public class EncryptTest {
    public static void main(String[] args) {
        String pwd=EncryptUtil.getInstance().XORencode("123456","123");
        System.out.println(pwd);
        String orign=EncryptUtil.getInstance().XORdecode(pwd,"123");
        System.out.println("orign1"+orign);

        String pwd2=EncryptUtil.getInstance().Base64Encode("12345678");
        System.out.println(pwd2);
        String orign2=EncryptUtil.getInstance().Base64Decode(pwd2);
        System.out.println("orign2:"+orign2);

        String pwd3=EncryptUtil.getInstance().DESencode("12345678","123");
        System.out.println(pwd3);
        String orign3=EncryptUtil.getInstance().DESdecode(pwd3,"123");
        System.out.println("orign3:"+orign3);

    }
}
