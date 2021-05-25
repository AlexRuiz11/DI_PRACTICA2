package StatePatron;

public interface State {

    void jugar();
    void alimentar();
    void dormir();
    void comoEstas();

    void setTamagotchi(Mascota tamagotchi);
}