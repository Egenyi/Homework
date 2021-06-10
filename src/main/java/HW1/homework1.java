package HW1;

public class homework1 {public static void main(String[] args) {

    printThreeWords();
    checkSumSign();
    printColor();
    compareNumbers();
}

//
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
//
    public static void checkSumSign() {
        int a = 5, b = 14;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } if (sum < 0) {
            System.out.println("Сумма отрицательная");
        }
    }
//
    public static void printColor() {
        int value = 55;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 & value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

//
    public static void compareNumbers() {
        int a = 8, b = 17;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}



