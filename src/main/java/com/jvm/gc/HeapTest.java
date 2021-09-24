package com.jvm.gc;

import java.util.ArrayList;
import java.util.List;

public class HeapTest {
    public static void main(String[] args) {

        List<User> list = new ArrayList<User>();
        while (true) {
            list.add(new User());
        }
    }

}
class User{

}