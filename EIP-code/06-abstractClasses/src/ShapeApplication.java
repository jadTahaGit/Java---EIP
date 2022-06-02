import java.awt.*;
import java.util.Scanner;

public class ShapeApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape[] shapes = new Shape[10];

        System.out.println("Bitte geben sie einge geometrische Form ein. Zur Auswahl stehen: \n Dreieck \n Quadrat \n Linie \n Zum Beenden des Programmes geben sie \"Ende\" ein.");

        for (int i = 0; i < shapes.length; i++) {

            String wahl = scanner.toString();
        }

        for (int i = 0; i < shapes.length; i++) {
            if(shapes[i] != null) {
                shapes[i].printShape();
                System.out.println();
            }
        }}
}
