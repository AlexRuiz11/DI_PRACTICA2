package StatePatron;

import java.util.Scanner;

public class Menu {
    Mascota tamagotchi;

    public Menu(Mascota tamagochi) {
        this.tamagotchi = tamagochi;
    }

    public void display() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        String mensajeOpciones = "Realizar acción: " +
                "1-Alimentar,2-Dormir, 3-Jugar, 4-Preguntar, 0-Salir";

        while (true) {
            System.out.println(mensajeOpciones);
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1: tamagotchi.alimentar(); break;
                case 2: tamagotchi.dormir(); break;
                case 3: tamagotchi.jugar(); break;
                case 4: tamagotchi.comoEstas(); break;
                case 0: System.out.println("Hasta pronto!"); System.exit(0);
                default: System.out.println("Opcion no válida");
            }
        }
    }
}