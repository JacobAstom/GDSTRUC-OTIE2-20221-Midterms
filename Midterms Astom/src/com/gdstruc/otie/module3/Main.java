package com.gdstruc.otie.module3;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static void drawCard(LinkedStack stack, LinkedStack2 stack2, int r){
        Player player;
        for (int i = 0; i < r; i++){
            player = stack.peek();
            stack2.push(player);
            stack.pop();
        }
    }
    private static void discardCard(LinkedStack3 stack3, LinkedStack2 stack2, int r){
        Player player;
        for (int i = 0; i < r; i++){
            player = stack2.peek();
            stack3.push(player);
            stack2.pop();
        }
    }
    private static void getCard(LinkedStack stack, LinkedStack3 stack3, int r){
        Player player;
        for (int i = 0; i < r; i++){
            player = stack3.peek();
            stack.push(player);
            stack3.pop();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        LinkedStack stack = new LinkedStack();
        LinkedStack2 stack2 = new LinkedStack2();
        LinkedStack3 stack3 = new LinkedStack3();

        // push elements to our stack
        stack.push(new Player(1, "Clubs", 1));
        stack.push(new Player(2, "Clubs", 2));
        stack.push(new Player(3, "Clubs", 3));
        stack.push(new Player(4, "Clubs", 4));
        stack.push(new Player(5, "Clubs", 5));
        stack.push(new Player(6, "Clubs", 6));
        stack.push(new Player(7, "Clubs", 7));
        stack.push(new Player(8, "Hearts", 8));
        stack.push(new Player(9, "Hearts", 9));
        stack.push(new Player(10, "Hearts", 10));
        stack.push(new Player(11, "Hearts", 1));
        stack.push(new Player(12, "Hearts", 2));
        stack.push(new Player(13, "Hearts", 3));
        stack.push(new Player(14, "Hearts", 4));
        stack.push(new Player(15, "Spades", 5));
        stack.push(new Player(16, "Spades", 6));
        stack.push(new Player(17, "Spades", 7));
        stack.push(new Player(18, "Spades", 8));
        stack.push(new Player(19, "Spades", 9));
        stack.push(new Player(20, "Spades", 10));
        stack.push(new Player(21, "Spades", 1));
        stack.push(new Player(22, "Diamonds", 2));
        stack.push(new Player(23, "Diamonds", 3));
        stack.push(new Player(24, "Diamonds", 4));
        stack.push(new Player(25, "Diamonds", 5));
        stack.push(new Player(26, "Diamonds", 6));
        stack.push(new Player(27, "Diamonds", 7));
        stack.push(new Player(28, "Diamonds", 8));
        stack.push(new Player(29, "Diamonds", 9));
        stack.push(new Player(30, "Diamonds", 10));


        // game loop
        while (stack.isEmpty() == false){
            System.out.println("Beginning of round!");

            int playerCommand = random.nextInt(4);
            int r = random.nextInt(6);

            System.out.println("Press any key to continue");
            scanner.nextLine();

            // command conditions
            // draw
            if (playerCommand == 1) {
                drawCard(stack, stack2, r);
            }
            // discard
            else if (playerCommand == 2) {
                discardCard(stack3, stack2, r);
            }
            // retrieve
            else if (playerCommand == 3){
                getCard(stack, stack3, r);
            }

            // after round
            System.out.println("Card stats (after round)");
            stack.printStack();
            stack2.printCount();
            stack3.printCount();
        }
        // game ended
        System.out.println("Game has end!");
    }
}