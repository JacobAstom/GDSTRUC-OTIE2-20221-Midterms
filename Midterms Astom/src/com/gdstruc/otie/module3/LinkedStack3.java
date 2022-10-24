package com.gdstruc.otie.module3;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.ListIterator;

// wrapper class to limit the LinkedList class into Stack operations
public class LinkedStack3 {
    private LinkedList<Player> stack;

    public LinkedStack3() {
        stack = new LinkedList<>();
    }

    public void push(Player player) {
        stack.push(player);
    }

    public Player pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return stack.pop();
    }

    public Player peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void printStack() {
        System.out.println("Deck ");
        ListIterator<Player> iterator = stack.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void printCount() {
        int i = 0;
        ListIterator<Player> iterator = stack.listIterator();

        while (iterator.hasNext()) {
            iterator.next();
            i++;
        }
        System.out.println("Cards in deck " + i);
    }

    public int count() {
        int i = 0;
        ListIterator<Player> iterator =stack.listIterator();

        while (iterator.hasNext()) {
            iterator.next();
            i++;
        }
        return i;
    }
}
