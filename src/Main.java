public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println();
        System.out.println("Задание 1.1");
        int[] intArr = new int[3];
        int i = 0;
        int elm = intArr[i];
        while (i < intArr.length) {
            elm = i + 1;
            i++;
            System.out.println(elm);
        }
        System.out.println();
        System.out.println("Задание 1.2");
        double[] doubleArr = {1.57, 7.654, 9.986};
        for (int i1 = 0; i1 < doubleArr.length; i1++) {
            System.out.println(doubleArr[i1]);
        }

        System.out.println();
        System.out.println("Задание 1.3");
        int[] intArr2 = new int[10];
        for (int i1 = 0; i1 < intArr2.length; i1++) {
            int elm2 = intArr2[i1];
            elm2 = i1 + 1;
            System.out.printf("%d Элемент массива = %d %n", i1, elm2);
        }
    }

    public static void task2() {
        System.out.println();
        System.out.println("Задание 2");
        int[] intArr = new int[3];
        for (int i = 0; i < intArr.length; i++) {
            int elm = intArr[i];
            elm = i + 1;
            if (i < intArr.length - 1) {
                System.out.printf("%d, ", elm);
            } else {
                System.out.printf("%d %n", elm);
                break;
            }
        }
        double[] doubleArr = {1.57, 7.654, 9.986};
        for (int i = 0; i < doubleArr.length; i++) {
            double elmD = doubleArr[i];
            if (i < doubleArr.length - 1) {
                System.out.printf("%s, ", elmD);
            } else {
                System.out.printf("%s %n", elmD);
                break;
            }
        }
        int[] intArr2 = new int[10];
        for (int i = 0; i < intArr2.length; i++) {
            int elm2 = intArr2[i];
            elm2 = i + 1;
            if (i < intArr2.length - 1) {
                System.out.printf("%d, ", elm2);
            } else {
                System.out.printf("%d %n", elm2);
                break;
            }
        }
    }

    public static void task3() {
        System.out.println();
        System.out.println("Задание 3");
        int[] intArr = {1, 2, 3};
        for (int i = intArr.length - 1; i >= 0; i--) {
            System.out.print(intArr[i]);
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.println();
        }

        double[] doubleArr = {1.57, 7.654, 9.986};
        for (int i = doubleArr.length - 1; i >= 0; i--) {
            double elmD = doubleArr[i];
            if (i != 0) {
                System.out.printf("%s, ", elmD);
            } else {
                System.out.printf("%s %n", elmD);
                break;
            }
        }
        int[] intArr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = intArr2.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.printf("%d, ", intArr2[i]);
            } else {
                System.out.printf("%d %n", intArr2[i]);
                break;
            }
        }

    }

    public static void task4() {
        System.out.println();
        System.out.println("Задание 4");
        int[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < intArr.length; i++) {
            int elm = intArr[i];
            if (elm % 2 != 0) {
                elm++;
            }
            if (i != intArr.length-1) {
                System.out.printf("%d, ", elm);
            } else {
                System.out.printf("%d %n", elm);
                break;
            }
        }
    }
}
