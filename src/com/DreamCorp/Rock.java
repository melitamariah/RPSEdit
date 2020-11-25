package com.DreamCorp;

public class Rock {

   public static String cpuAnswer;


    public Rock(int choice) {

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
            if(cpuAnswer.equals("Scissors")){
                return 1;
            } else {
                return 0;
            }
        }

    }

