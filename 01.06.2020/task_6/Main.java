public class Main {
    public static void main(String[] args) {
        int a;
        double b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        a = scanner.nextInt();
        b = ((a * 0.15) + a);
        System.out.print("Result of adding 15% is: "+b);
    }
}
