//Write a Java program to extract the primitive type value from a given BigInteger value. 
//BigInteger() translates the sign-magnitude representation of a BigInteger into a BigInteger. 
//The sign is represented as an integer signum value: -1 for negative, 0 for zero, or 1 for positive. 
//The magnitude is a byte array in big-endian byte-order: the most significant byte is in the zeroth element. 
//A zero-length magnitude array is permissible, and will result in a BigInteger value of 0, whether signum is -1, 0 or 1.

import java.math.BigInteger;
import java.util.Scanner;

public class exmpl {
    public static void main(String[] args) {
       BigInteger bigint = BigInteger.valueOf(Long.MAX_VALUE);
       System.out.println("BigInteger value is " + bigint);
       long long_val = bigint.longValue();
       int int_val = bigint.intValue();
       short short_val = bigint.shortValue();
       byte byte_val = bigint.byteValue();
       long l_val = bigint.longValueExact();

       System.out.println("Convert the said BigInteger to an long value: " + long_val);
       System.out.println("Convert the said BigInteger to an int value: " + int_val);
       System.out.println("Convert the said BigInteger to an short value: " + short_val);
       System.out.println("Convert the said BigInteger to an byte value: " + byte_val);
       System.out.println("Convert the said BigInteger to an exact long value: " + l_val);
    }
}
