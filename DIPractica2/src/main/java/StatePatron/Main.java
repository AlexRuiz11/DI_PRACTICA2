package StatePatron;

public class Main {

    public static void main(String[] args) {
        Mascota miMascota = new Mascota();

        new Menu(miMascota).display();
    }
}