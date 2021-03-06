package com.DreamCorp;


import java.util.Random;
import java.util.Scanner;

public class Game {

    public static int choice;
    public static String userString;
    public static String cpuAnswer;
    int wins = 0;
    int losses = 0;
    public boolean isPlaying = true;
    int gameRounds = 0;

    public int startGame() {

        String userName = "";

            //start game
            while (isPlaying) {

                Scanner scanner = new Scanner(System.in);

                System.out.println("-----------------------");
                System.out.println("Welcome to RPS!");
                System.out.print("Want to play? ");

                String userWelcome = scanner.nextLine().toUpperCase();

                if (userWelcome.equals("N") || userWelcome.equals("NO")) {
                    System.out.println("Alright, next time.");
                    break;
                } else if (!userWelcome.equals("YES") && !userWelcome.equals("Y")) {
                    System.out.println("Try again. Please choose yes or no.");
                    continue;
                } else if(gameRounds < 1) {
                    System.out.print("Enter player name: ");
                    userName = scanner.nextLine();
                    System.out.println("-----------------------\n");
                }

                    System.out.println("Let's go, " + userName + "! Rock, Paper, Scissors!\n" +
                            "Rock = 1, Paper " + "= 2 and Scissors = 3.");
                    System.out.println();
                    System.out.print("Choose your weapon: ");

                    //create a variable to hold the user response using the Scanner object. The response needs to be an integer between 1-3 (1 = Rock, 2 = Paper, 3 = Scissors)
                    choice = scanner.nextInt();
                    int response = -1;

                    if (choice == 1) {
                        userString = "Rock";
                        response = new Rock(getCPUResponse()).checkOutcome();
                    } else if (choice == 2) {
                        userString = "Paper";
                        response = new Paper(getCPUResponse()).checkOutcome();
                    } else if (choice == 3) {
                        userString = "Scissors";
                        response = new Scissors(getCPUResponse()).checkOutcome();
                    } else
                        System.out.println("Error!");


                    System.out.println("\n" + userString + " -VS- " + cpuAnswer + "\n");
                    // create a variable to hold the cpu response generated by the getCPUResponse() method.

                    if (response == 1) {
                        wins++;
                        System.out.println("Nice, " + userName + "! You won!!");
                    } else if (response == 0) {
                        losses++;
                        System.out.println("Sorry, " + userName + ".. You lost!");
                    } else {
                        System.out.println("Sum aint rite");
                    }
                    System.out.println(userName + "s " + "Wins: " + wins + " | Losses: " + losses);
                    gameRounds++;

                    //compare user and cpu response with each other to decide the winner.

            }
            return 5;
        }



    public static int getCPUResponse() {
           Random generator = new Random();
           int cpuAnswerInt = generator.nextInt(3) + 1;
           // Generate random integers in range 1 to 3
            if (cpuAnswerInt == 1) {
               cpuAnswer = ("Rock");
           } else if (cpuAnswerInt == 2) {
               cpuAnswer = ("Paper");
           } else {
               cpuAnswer = ("Scissors");
           }
           return cpuAnswerInt;
       }

    }



