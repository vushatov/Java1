import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.math.*;

public class RandomArray extends Demo{
    public static void main(String[] args) throws InputMismatchException, ArrayIndexOutOfBoundsException, Exception {

        //Min + (int)(Math.random() * ((Max - Min) + 1)) ШАБЛОН ДЛЯ РАНДОМА

        int size = 31;
        int[] value = new int[size];
        boolean[] valuesCreated = new boolean[size + 1];

        int randnum;
        java.util.Random num = new java.util.Random();

        for (int x = 0; x < value.length; x++) // Fills array with Random Numbers from 0 to 225
        {
            do {
                randnum = (num.nextInt(value.length)) + 1;
            } while (valuesCreated[randnum] == true);

            value[x] = randnum;
            valuesCreated[randnum] = true;
        }
        for (int i = 0; i < value.length - 1; i++) {
            System.out.println(value[i]);
        }
    }
}
