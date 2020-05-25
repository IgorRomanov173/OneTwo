import java.util.Scanner;

public class FirstTask {

    public static void main(String[] args) {

        // Ввод углов в систему
        Scanner in = new Scanner(System.in);
        System.out.print("Input angle 1: ");
        int ang1 = in.nextInt();
        System.out.print("Input angle 2: ");
        int ang2 = in.nextInt();

        // Переменные для определения большего и меньшего из введенных значений + логика определения
        int big;
        int small;
        if (ang1 >= ang2) {
            big = ang1;
            small = ang2;
        }
        else {
            big = ang2;
            small = ang1;
        }

        // Переменные для определения разницы между углами и логика выбора меньшего значения
        int minAng1;
        int minAng2;

        minAng1 = big - small;
        minAng2 = 360 - big + small;

        if (minAng1 < minAng2) {
            System.out.printf("Min Angle is %d \n", minAng1);
        }
        else {
            System.out.printf("Min Angle is %d \n", minAng2);

        }
    }
}