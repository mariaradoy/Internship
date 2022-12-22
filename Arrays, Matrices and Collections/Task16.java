//Write a Java program which reverses: [1,2,3,4].

public class other {

    public static void main(String[] args) {
    int[] array = {1,2,3,4};
    int[] newarr = new int[array.length];
    int j = 0;
    for(int i = array.length-1; i >=0; i--){
        newarr[j++] = array[i];
    }

    for(int i = 0; i < newarr.length; i++){
        System.out.print(newarr[i] + " ");
    }
    }
}
