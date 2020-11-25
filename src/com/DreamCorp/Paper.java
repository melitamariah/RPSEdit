package com.DreamCorp;

public class Paper {

    public static String cpuAnswer;


    public Paper(int choice) {

        switch (choice) {
                case 1:
                    cpuAnswer = "Rock";
                    break;
                case 2:
                    cpuAnswer = "Paper";
                    break;
                case 3:
                    cpuAnswer = "Scissors";
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }


    public int checkOutcome() {
            if(cpuAnswer.equals("Rock")){
                return 1;
            } else {
                return 0;
            }
        }
    }

