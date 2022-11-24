//Write a Java method to display the first 50 pentagonal numbers. A polygonal number of the form n(3n-1)/2. The first few are 1, 5, 12, 22, 35, 51, 70,... 


public class methods {
    public static int pentagonal(int n) {
        return (n*(3*n-1))/2;
    }
    public static void main(String[] args) {
        int count = 1;
        for(int i = 1; i <= 50; i++){
            System.out.printf("%-5d",pentagonal(i));
            if(count % 10 == 0) System.out.println();
            count++;
        }
    }
}
