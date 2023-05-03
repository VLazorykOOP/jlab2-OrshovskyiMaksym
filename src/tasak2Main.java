import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input height of cone: ");
        int height = scan.nextInt();
        System.out.print("Input radius of cone: ");
        int radius = scan.nextInt();
        Cone cone = new Cone(height, radius);
        System.out.println(cone);
        System.out.println("The area of the lateral base: " + cone.calculateArea());
        System.out.println("Volume cone: " + cone.calculateVolumeCone());
    }
}
