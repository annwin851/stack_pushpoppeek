package ru.ru.levelup.lesson_3_stack;

import java.util.Stack;

public class StackJava {

    int stack[] = new int [5];
    int top = 0;
    public void push(int data)
    {
      stack[top] = data;
      top++;
    }

    public int pop()
    {
        int data;
        data = stack[top];
        stack[top] = 0;
        return data;
    }
    public int peek()

    {
        int data;
        data = stack[top - 1];
        stack[top] = 0;
        return data;
    }
}

