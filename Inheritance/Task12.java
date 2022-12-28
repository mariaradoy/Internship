// Different signature of method
// Create a class to print an integer and a character with two methods having the same name but different sequence of the integer and the character parameters.
// For example, if the parameters of the first method are of the form (int n, char c), then that of the second method will be of the form (char c, int n).

public class polymorphism {

    static void print(int n, char c){
        System.out.println(n + " " + c);
    }

    static void print(char c, int n){
        System.out.println(c + " " + n);
    }
    public static void main(String[] args) {
        print(1, 'a');
        print('a', 1);
    }
}
