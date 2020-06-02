public class Main {
    public static int multiplication(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(multiplication(10));
    }
}
