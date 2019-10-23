import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.math.*;

public class Demo {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws InputMismatchException, ArrayIndexOutOfBoundsException , Exception{

        int a=0;
        int b;
        int c;
        boolean r= true;
        for (int i=0; i<1;) {
while (r){
           try{
               System.out.println("Введите сумму: ");
               a = scanner.nextInt();
           r=false;}
            catch (InputMismatchException e) {
               System.out.println("Error!!");
               scanner.next();
               }
}
            b = a % 10;
            c=a%100;
            if (b == 1 &&c!=11) {
                System.out.println(a + " Рубль");
            } else if  (b==0 || b>=5 &&b<=9 || c>=11 &&c<=19) {
                System.out.println(a + " Рублей");
            } else System.out.println(a + " Рубля");
            System.out.println("Repeat? Enter 'Y' if yes and 'N' if no: ");
            char rep = scanner.next().charAt(0);
            switch (rep){
                case 'Y':
                    i =0;
                    break;
                case 'N':
                    i =1;
                    break;
                default:
                    System.out.println("Invalid input, auto exit!");
                    i=1;
                    break; }
        }
        scanner.close();
    }

}