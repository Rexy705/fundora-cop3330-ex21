/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Rey Fundora
 */

package ex21;

import java.util.Scanner;

public class ex21 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean correct = false;

        while (correct.equals(false)) {

            System.out.print("Please enter the number of the month: ");
            String num_in = input.nextLine();

            try {
                int test = Integer.parseInt(num_in);
                if (test < 1 || 12 < test ) {
                    System.out.println("""
                            
                            Number chosen is not associated with a month.
                            Only enter integer values from 1 to 12.
                            """);
                    correct = false; continue;
                }
            }
            catch (Exception e) {
                System.out.println("""
                        
                        Invalid input. Only enter integer values from 1 to 12.
                        """);
                correct = false; continue;
            }


            switch (num_in) {
                case "1" -> System.out.println("The name of the month is January.");
                case "2" -> System.out.println("The name of the month is February.");
                case "3" -> System.out.println("The name of the month is March.");
                case "4" -> System.out.println("The name of the month is April.");
                case "5" -> System.out.println("The name of the month is May.");
                case "6" -> System.out.println("The name of the month is June.");
                case "7" -> System.out.println("The name of the month is July.");
                case "8" -> System.out.println("The name of the month is August.");
                case "9" -> System.out.println("The name of the month is September.");
                case "10" -> System.out.println("The name of the month is October.");
                case "11" -> System.out.println("The name of the month is November.");
                case "12" -> System.out.println("The name of the month is December.");
            }

            correct = true;
        }
    }
}
