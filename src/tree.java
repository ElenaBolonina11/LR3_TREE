import java.util.Arrays;
import java.util.Scanner;

public class tree {
    public static void main(String[] params) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int x = input.nextInt();
        int[] numbers = new int[x];
        Object2o1 vvod = new Object2o1(x, numbers);
        vvod.vvodM();
        vvod.print();
        vvod.sort();
        vvod.print();
        System.out.println("Введите число от 0 до 15 для поиска");
        int searNumber = input.nextInt();
        vvod.serch(searNumber);
    }

    static class Object2o1 {
        int x;
        int[] numbers;
        int searNumber;

        public Object2o1(int x, int[] numbers) {
            this.x = x;
            this.numbers = numbers;
            this.searNumber = searNumber;
        }

        public void print() {
            System.out.println("Массив");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println(" ");
        }
        public void sort(){
            System.out.println("Сортируем");
            Arrays.sort(numbers);
        }
        public void vvodM() {
            Scanner input = new Scanner(System.in);
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = ((int)(Math.random() * 15));
            }
        }
        public void serch(int searNumber){
            int first = numbers[0];
            int last = numbers[numbers.length-1];
            int middle;
            int j = 0;
            do {
                middle = (first + last) / 2;
                System.out.print("Попытка номер - " + (j + 1));
                System.out.print(", first - " + (first));
                System.out.print(", last - " + (last));
                System.out.println(", middle - " + (middle));
                if (middle == searNumber) {
                    System.out.println("Загаданное число найдено " + searNumber);
                } else if ( searNumber < middle ){
                    last = middle;
                } else {
                    first = middle;
                }
                j++;
            } while (searNumber != middle);
        }
    }
}