package org.basic;

import javax.swing.*;

public class Alien {
    public int age;
    public Computer com;

    public void code() {
        System.out.println("Coding...");
    }

    public void compile() {
        com.compile();
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setCom(Computer com) {
        this.com = com;
    }
}
