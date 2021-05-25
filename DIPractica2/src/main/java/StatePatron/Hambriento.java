package StatePatron;

public class Hambriento implements State {

		
	
	private Mascota tamagotchi;

    @Override
    public void jugar() {
        System.out.println("No quiero jugar!");
    }

    @Override
    public void alimentar() {
        System.out.println("Ñom ñom ñom");
        tamagotchi.setState(new Aburrido());
    }

    @Override
    public void dormir() {
        System.out.println("No quiero dormir!");
    }

    @Override
    public void comoEstas() {
        System.out.println("Dame de comer!");
    }

    @Override
    public void setTamagotchi(Mascota tamagotchi) {
        this.tamagotchi = tamagotchi;
    }
}
