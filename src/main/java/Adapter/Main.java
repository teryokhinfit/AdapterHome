package Adapter;

public class Main {

    public static void main(String[] args) {

        Ints intsCalc = new IntsCalculator();
        System.out.println("2 + 2 = " + intsCalc.sum(2, 2)); //сумма двух чисел
        System.out.println("10 * 22 = " + intsCalc.mult(10, 22)); //сделал умножением вместо суммы
        System.out.println("2 в 10(ой) степени = " + intsCalc.pow(2, 10)); // 2 в десятой степени

    }
}
