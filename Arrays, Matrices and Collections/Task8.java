//Write a Java program that completes a vector A with n real numbers and modifies the content of the given vector as follows: to all values on even positions 
//the first element is added, and to those on odd positions - the last. The first and last items remain unchanged.

import java.util.Scanner;
import java.util.Vector;

public class exempl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the length of vector: ");
        int n = scanner.nextInt();
        Vector<Integer> v = new Vector(n);

        for(int i = 0; i < n; i++){
            System.out.print(String.format("Element %s: ", i));
            v.addElement(scanner.nextInt());
        }

        for(int i = 1; i < n - 1; i++){
            int j = v.get(i) + v.firstElement();
            int k = v.get(i) + v.lastElement();
            if(i%2 == 0) {
                v.remove(i);
                v.add(i, j);
            }
            if(i%2 !=0) {
                v.remove(i);
                v.add(i, k);
            }
        }

        for (int i = 0; i < n; i++){
            System.out.print(v.get(i) + " ");
        }

    }
}
