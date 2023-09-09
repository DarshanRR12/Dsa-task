package com.dsapractice;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LinkedList mylinkedList = new LinkedList();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! please choose the options given below.");
        System.out.println("Type 1 to add a node in a list.");
        System.out.println("Type 2 to delete any node in a list.");
        System.out.println("Type 3 to delete any repetitive nodes in list.");
        System.out.println("Type 4 to print all nodes in a list.");
        System.out.println("Type 5 to clear all nodes in a list.");
        System.out.println("Type 6 to exit.");


        boolean programExit = false;

        while (!programExit){
            System.out.print("Enter your choice: ");
            int userChoices = scanner.nextInt();
            switch (userChoices) {
                case 1 -> {
                    System.out.print("Enter the value to append : ");
                    int value = scanner.nextInt();
                    mylinkedList.appendList(value);
                }
                case 2 -> {
                    System.out.print("Enter the value to delete : ");
                    int data = scanner.nextInt();
                    mylinkedList.deleteNode(data);
                }
                case 3 -> {
                    System.out.print("Enter the value to delete : ");
                    int dataToDelete = scanner.nextInt();
                    mylinkedList.deleteAllOccurrences(dataToDelete);
                }
                case 4 -> mylinkedList.printList();
                case 5 -> mylinkedList.clearList();
                case 6 -> programExit = true;
                default -> System.out.println("Wrong input try again!");
            }
        }
    }
}