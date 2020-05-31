package by.bsuir.lab7.main;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static int n;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("n >> ");
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.print("n >> ");
            }
            n = sc.nextInt();

            char[] array = {
                    'Б', 'В', 'Г', 'Д', 'Ж', 'З', 'К', 'Л', 'М', 'Н', 'П', 'Р', 'С', 'Т', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ'
            };

            System.out.println(" Число букв: " + n);

            Random rand = new Random();

            for (int i = 0; i < n; i++) {
                System.out.print(" " + array[rand.nextInt(array.length)]);
            }
            System.out.println();

        }while(true);
    }

}
