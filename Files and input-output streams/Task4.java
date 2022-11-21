//Write a Java program to read first 3 lines from a file with implements Java exceptions.

import java.io.*;

public class other {
    public static void main(String[] args) {
        String strLine = "";
        try {
            LineNumberReader reader = new LineNumberReader(new InputStreamReader(new FileInputStream("C:\\Users\\maria\\Desktop\\antreprenoriat.txt"), "UTF-8"));
            while (((strLine = reader.readLine()) != null) && reader.getLineNumber() <= 3){
                System.out.println(strLine);
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }

    }
}
