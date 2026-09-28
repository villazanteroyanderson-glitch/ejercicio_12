//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
void main() {

            Scanner roy = new Scanner(System.in);

            int opcion;
            int tamaño;

            do {
                System.out.println("\n===== MENU DE FIGURAS =====");
                System.out.println("1. Cuadrado");
                System.out.println("2. Triangulo");
                System.out.println("3. Triangulo invertido");
                System.out.println("4. Rectangulo");
                System.out.println("5. Salir");
                System.out.print("Elige una opcion: ");

                opcion = roy.nextInt();

                if (opcion >= 1 && opcion <= 4) {

                    System.out.print("Ingresa el tamaño: ");
                    tamaño = roy.nextInt();

                    if (opcion == 1) {

                        for (int i = 1; i <= tamaño; i++) {
                            for (int j = 1; j <= tamaño; j++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }

                    } else if (opcion == 2) {

                        int i = 1;

                        while (i <= tamaño) {

                            int j = 1;

                            while (j <= i) {
                                System.out.print("* ");
                                j++;
                            }

                            System.out.println();
                            i++;
                        }

                    } else if (opcion == 3) {

                        int i = tamaño;

                        do {
                            int j = 1;

                            do {
                                System.out.print("* ");
                                j++;
                            } while (j <= i);

                            System.out.println();
                            i--;

                        } while (i >= 1);

                    } else if (opcion == 4) {

                        for (int i = 1; i <= tamaño; i++) {
                            for (int j = 1; j <= tamaño + 2; j++) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                    }

                } else if (opcion != 5) {
                    System.out.println("Opcion no valida.");
                }

            } while (opcion != 5);

            System.out.println("Programa terminado.");

            roy.close();
        }

