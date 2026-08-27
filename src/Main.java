import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//task 1
        int[] inputArray1 = new int[5];
        inputArray1[0] = 5000;
        inputArray1[1] = 7000;
        inputArray1[2] = 10000;
        inputArray1[3] = 12000;
        inputArray1[4] = 9000;

        double[] outputArray1 = new double[4];
        int sum = 0;
        int max = inputArray1[0];
        int min = inputArray1[0];

        for (int value : inputArray1) {
            sum += value;
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }
        double average = (double) sum / inputArray1.length;
        outputArray1[0] = sum;
        outputArray1[1] = max;
        outputArray1[2] = min;
        outputArray1[3] = average;

        System.out.println("Входной массив (выплаты авторам):");
        for (int value : inputArray1) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("Выходной массив [сумма, максимум, минимум, среднее]:");
        for (double value : outputArray1) {
            System.out.print(value + " ");
        }
        System.out.println();

//task 2
        int[] inputArray2 = {32000, 24000, 18000, 26000, 50000};

        int[] outputArray2 = new int[4];
        int sum1 = 0;
        int max1 = inputArray2[0];
        int min1 = inputArray2[0];

// вместо ручного отсчёта я использовал попроще метод с других сайтов. так же можно?
        int[] percentArray2 = new int[inputArray2.length];
        for (int i = 0; i < inputArray2.length; i++) {
            percentArray2[i] = (int) Math.round(inputArray2[i] * 0.13);
        }

        for (int value1 : inputArray2) {
            sum1 += value1;
            if (value1 > max1) {
                max1 = value1;
            }
            if (value1 < min1) {
                min1 = value1;
            }
        }
        int average1 = (int) sum1 / inputArray2.length;
        outputArray2[0] = sum1;
        outputArray2[1] = max1;
        outputArray2[2] = min1;
        outputArray2[3] = average1;

        System.out.println("Входной массив (выплаты сотрудникам):");
        for (int value1 : inputArray2) {
            System.out.print(value1 + " ");
        }
        System.out.println();
// Я не понимаю, как ввести 13% в выходной массив совмещённо(если надо было)
        System.out.println("13% от каждой выплаты:");
        for (int value1 : percentArray2) {
            System.out.print(value1 + " ");
        }
        System.out.println();

        System.out.println("Выходной массив [сумма, максимум, минимум, среднее]:");
        for (int value1 : outputArray2) {
            System.out.print(value1 + " ");
        }
        System.out.println();

//task 3

        int[] inputArray3 = {2000, 6000, 8000, 1000, 3000};
        boolean[] outputArray3 = new boolean[inputArray3.length];

        for (int i = 0; i < inputArray3.length; i++) {
            outputArray3[i] = inputArray3[i] > 5000;
        }

// Так же можно? В голове всё перемешалось и я очень начинаю путаться.
///Взял с других ресурсов
        System.out.println("inputArray3: " + java.util.Arrays.toString(inputArray3));
        System.out.println("outputArray3: " + java.util.Arrays.toString(outputArray3));

//task 4

                int[] inputArray4 = {3260, 2000, -5760, 300, 1000};
                boolean outputArray4 = true;

                for (int balance : inputArray4) {
                    if (balance < 0) {
                        outputArray4 = false;
                        break;
                    }
                }

                System.out.println("inputArray4 = " + java.util.Arrays.toString(inputArray4));
                System.out.println("outputArray4 = " + outputArray4);

//task 5

        int[] inputArray5 = {1650, -3020, 20540, 0, 7655};

        int profitableCount = 0;
        for (int profit : inputArray5) {
            if (profit > 0) {
                profitableCount++;
            }
        }

         int[] outputArray5 = new int[1];
        outputArray5[0] = profitableCount;

        System.out.println("Прибыль за месяцы:");
        for (int i = 0; i < inputArray5.length; i++) {
            System.out.println("Месяц " + (i + 1) + "- " + inputArray5[i]);
        }

        System.out.println("Количество рентабельных месяцев (прибыль > 0): " + outputArray5[0]);

    }
}

