//Write a Java program which accepts students name, id, and marks and displays the highest score and the lowest score. 
//The student name and id are all strings of no more than 10 characters. The score is an integer between 0 and 50.

import java.util.Scanner;

public class other {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of students: ");
        int num_st = scanner.nextInt();

        String[] id = new String[num_st];
        String[] name = new String[num_st];
        int[] score = new int[num_st];

        for(int i = 0; i < num_st; i++){
            System.out.print("ID: ");
            id[i] = scanner.next();

            System.out.print("Name: ");
            name[i] = scanner.next();

            System.out.print("Score: ");
            score[i] = scanner.nextInt();

            System.out.println();
        }

        int max = score[0], min = score[0];

        for (int i = 0; i < num_st; i++){
            if(score[i] >= 0 && score[i] <= 50){
                if (score[i] >= max) max = score[i];
                if (score[i] <= min) min = score[i];
            }
        }

        for(int i = 0; i < num_st; i++){
            if(score[i] == max) System.out.println("Max score "+name[i] + " " + score[i]);
            if(score[i] == min) System.out.println("Min score "+name[i] + " " + score[i]);
        }
    }
}
