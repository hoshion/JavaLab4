package org.example;

public class Main {
    public static void main(String[] args) {
        Lab lab = new Lab();

        try {
            lab.calc();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}