public class Main {
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        a = scanner.nextInt();
        System.out.print("Enter width: ");
        b = scanner.nextInt();
        System.out.print("Enter height: ");
        c = scanner.nextInt();
        d = (a*b*c)*1000;
        System.out.print("Liters of water: "+ d);
    }
}
