package ru.ru.levelup.lesson_3_stack;

import java.util.Stack;

public class App {


    public static void main(String[] args) {

        Stack nums = new Stack();
        nums.push(15);
        nums.push(8);
        nums.push(9);
        System.out.println(nums.peek());

        nums.push(10);

        System.out.println(nums.pop());



    }
}