package me;

public class RecursionMethod {

    public static void main(String[] args) {
        helloMethod(3);
        System.out.println("А вот и факториал! Он у нас сегодня равняется " + factR(4));
    }

    // в стек пошел метод helloMethod() с аргументом 3 -> helloMethod(2) -> helloMethod(1) -> helloMethod(0)

    public static void helloMethod(int n) {
        System.out.println(n + ") Hi man! What's up?");

        if(n == 0) {
            return;
        }
        helloMethod(n - 1);
    }

    public static int factR(int num) {
        int result;

        if(num == 1) {
            return 1;
        }

        result = (factR(num - 1) * num);
        return result;
    }
}
