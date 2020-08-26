package com.company;


public class Main {

    public static void main(String[] args) {
        Object integers[] = {1, 2, 3, 4};
        Object hello[] = {"hello"};

        Generic generic = new Generic(integers);
        Generic string = new Generic(hello);
        System.out.println(string);
        System.out.println(generic.toString());
    }

}