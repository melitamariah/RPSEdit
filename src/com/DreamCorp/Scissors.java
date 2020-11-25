package com.DreamCorp;

public class Scissors {

    public static String cpuAnswer;


    public Scissors(int choice) {


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
            if(cpuAnswer.equals("Paper")){
                return 1;
            } else {
                return 0;
            }
        }
    }

