public class Ej4 {
    public static void main(String[] args) {
        int num = 102;
        int sum = sumOfDigits(num);
        System.out.println(sum);
    }

    public static int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        } else {
            return num % 10 + sumOfDigits(num / 10);
        }
    }
}
