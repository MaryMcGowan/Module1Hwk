package edu.wctc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

            playerName();

            int quiz;

            do {
            System.out.println("Welcome to the Preference Quiz!");
            System.out.println("----------------------------------");

            // ask for user inputs

                String[] userPrompts = {"Do you prefer mild or spicy? ","Do you prefer tea or coffee? ", "Do you prefer breakfast or brunch? ",
                        "Do you prefer summer or winter? ", "Do you prefer paper or plastic? "};
                int[] userAnswers = new int[5];

                for (int i=0; i < userPrompts.length; i++) {
                    System.out.println(userPrompts[i]);
                    System.out.println("Enter 0 for the preference on the right ");
                    System.out.println("Enter 1 for preference on the left ");
                    userAnswers[i] = keyboard.nextInt();
                }

            // give their score

            int score = userAnswers[0] + userAnswers[1] + userAnswers[2] + userAnswers[3] + userAnswers[4];

            String[] preference = {"You prefer life to be calm and organized. ", "You prefer a good balance in life. ",
                        "You prefer life to be spontaneous and active! "};

            if (score < 3) {
                System.out.println(preference[0]);
            }

            else if (score == 3) {
                System.out.println(preference[1]);
            }

            else{
                System.out.println(preference[2]);
            }

            System.out.println("Again? Enter 1 to play again, or any other key to exit. ");
            quiz = keyboard.nextInt();

        }
            while (quiz == 1);



    }

    public static void playerName() {

        Scanner pName = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String name = pName.nextLine();

        System.out.println("Hi " + name + "!");
    }

}

