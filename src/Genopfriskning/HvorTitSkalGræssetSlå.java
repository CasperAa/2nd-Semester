package Genopfriskning;

import java.util.Scanner;

public class HvorTitSkalGræssetSlå {
    public static void main(String[] args) {
        double maxLength;
        double currentLength;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Current grass height in cm?");
        currentLength = userInput.nextDouble();
        System.out.println("What is your max grass height in cm");
        maxLength = userInput.nextDouble();

        whenToCutGrass(currentLength, maxLength);
    }

        public static void whenToCutGrass(double currentLength, double maxLength){

            double dailyGrowth = 0.8;
            int daysToCutting = 0;

            if(currentLength < maxLength) {
                for (double i = currentLength; maxLength > i; i += dailyGrowth) {
                    daysToCutting++;
                }
                System.out.println("You need to cut your grass in " + daysToCutting + " days");
            } else if (currentLength > maxLength){
                System.out.println("You are already behind schedule, start that engine now");
            }


        }

    }
