public class Main {
    public static void main(String[] args) {
        float tC;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter TC number: ");
        tC = scanner.nextInt();
        float tF = ((tC / 5) * 9) + 32;
        System.out.print("TF number is: " + tF);
    }
}
