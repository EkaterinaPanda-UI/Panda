public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }
    public static int sumDigitsInNumber(int number) {
        int a = number / 100;
        int b = a%10;
        int c = b % 100;
        return a+b+c;
    }
}
