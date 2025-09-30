import java.util.Scanner;

public class program {
    public static void main(String[] args) {
                Coche cocheSaab = new Coche("Saab", "Saab diesel 99", 1999);
                Coche cocheSeat = new Coche("Seat", "Ibiza MK2", 2000);

                Scanner scanner = new Scanner(System.in);

                System.out.println("¿Qué coche quieres encender?");
                System.out.println("1. Seat");
                System.out.println("2. Saab");
                System.out.print("Elige una opción: ");
                int opcion = scanner.nextInt();

                if (opcion == 1) {
                    cocheSeat.startEngine();
                    System.out.println("¿Quieres apagar el Seat? 1(si), 2(no)");
                    int apagar = scanner.nextInt();
                    if (apagar == 1) {
                        cocheSeat.stopEngine();
                    }
                } else if (opcion == 2) {
                    cocheSaab.startEngine();
                    System.out.println("¿Quieres apagar el Saab? 1(si), 2(no)");
                    int apagar = scanner.nextInt();
                    if (apagar == 1) {
                        cocheSaab.stopEngine();
                    }
                } else {
                    System.out.println("Opción no válida.");
                }

            }

    }


/**    public class Program {
        final static int OPCION_ENCENDER = 2, OPCION_APAGAR = 1, OPCION_SALIR = 3;

        public static void main(String[] args) {
           Coche CocheSaab = new Coche("Saab", "Saab diesel 99", 2000);
           int op = -1;

           while (op != 3){

               op = getUserInput();

               if (op == OPCION_APAGAR) {
                   CocheSaab.stopEngine();
               }
               if (op == OPCION_ENCENDER) {
                   CocheSaab.startEngine();
               }
               if (op == OPCION_SALIR) {
                   System.out.println("Se ha terminado");
               }
           }
        public static int getUserInput() {
        System.out.println("Para encender 1, para apagar 2, 3 para salir");
        int opcion = (new Scanner(System.in)).nextInt();
        return opcion;
}

        */





