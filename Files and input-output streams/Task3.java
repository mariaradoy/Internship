//Write a Java program to check if a file or directory has permission to read and write data.

import java.io.File;
import java.util.Scanner;

public class other {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\maria\\Desktop\\Учёба\\Предпринимательство");
        if(file.canRead()) {
            System.out.println(file + " can read");
        }
        else {
            System.out.println(file + " can't read");
        }
        if(file.canWrite()) {
            System.out.println(file + " can write");
        }
        else {
            System.out.println(file + " can't write");
        }
    }
}
