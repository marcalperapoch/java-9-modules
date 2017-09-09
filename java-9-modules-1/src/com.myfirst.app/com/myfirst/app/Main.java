package com.myfirst.app;

//import com.mysecond.app.internal.InternalNameProvider;
import com.mysecond.app.exported.NameProvider;

public class Main {

    public static void main(String[] args) {
        System.out.println("Name: " + NameProvider.getName());
    }
}
