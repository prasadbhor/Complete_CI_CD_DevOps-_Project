package com.example.gym;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private static final List<Member> members = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Gym Backend CLI!");

        while (true) {
            System.out.println("\n1. Add Member\n2. List Members\n3. Exit");
            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter member name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter member age: ");
                    int age = Integer.parseInt(scanner.nextLine());
                    members.add(new Member(name, age));
                    System.out.println("Member added successfully!");
                }
                case 2 -> {
                    System.out.println("Gym Members:");
                    members.forEach(System.out::println);
                }
                case 3 -> {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}

