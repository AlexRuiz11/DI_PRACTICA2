package StatePatron;

public class Cansado implements State {
    private Mascota tamagotchi;

    @Override
    public void jugar() {
        System.out.println("No quiero jugar!");
    }

    @Override
    public void alimentar() {
        System.out.println("No quiero comer!");
    }

    @Override
    public void dormir() {
        System.out.println("Buenas noches...");
        tamagotchi.setState(new Hambriento());
    }

    @Override
    public void comoEstas() {
        System.out.println("Tengo sueño...");
    }

    @Override
    public void setTamagotchi(Mascota tamagotchi) {
        this.tamagotchi = tamagotchi;
    }
}