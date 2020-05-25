import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        // Ввод начального и конечного чисел в систему
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int firstNum = in.nextInt();
        System.out.print("Input last number: ");
        int lastNum = in.nextInt();

        // Ввести переменную i, пройти циклом диапазон введенных значений
            for(int i = firstNum ; i <= lastNum ; i++) {
                if(i % 15 == 0) {
                    System.out.println("FizzBuzz");
                }
                else if(i % 3 == 0) {
                    System.out.println("Fizz");
                }
                else if(i % 5 == 0) {
                    System.out.println("Buzz");
                }
                else {
                    System.out.println(i);
                }
            }
        }
    }