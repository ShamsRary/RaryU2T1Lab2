import java.util.Scanner;
public class RectangleRunner {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter rectangle 1 length: ");
        int rect1Length = myScanner.nextInt();
        System.out.print("Enter rectangle 1 width: ");
        int rect1Width = myScanner.nextInt();
        System.out.print("Enter rectangle 1 height: ");
        double rect1Height = myScanner.nextDouble();
        System.out.print("Enter rectangle 2 length: ");
        int rect2Length = myScanner.nextInt();
        System.out.print("Enter rectangle 2 width: ");
        int rect2Width = myScanner.nextInt();
        System.out.print("Enter rectangle 2 height: ");
        double rect2Height = myScanner.nextDouble();

        Rectangle rect1 = new Rectangle(rect1Length, rect1Width);
        rect1.printArea();
        rect1.printBoxVolume(rect1Height);

        Rectangle rect2 = new Rectangle(rect2Length, rect2Width);
        rect2.printArea();
        rect2.printBoxVolume(rect2Height);



        // write the rest of your program below
    }
}

