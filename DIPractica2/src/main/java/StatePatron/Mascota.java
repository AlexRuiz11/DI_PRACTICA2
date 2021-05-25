package StatePatron;

public class Mascota {
    private State estado;

    public Mascota() {
        setState(new Aburrido());
    }

    public void setState(State estado) {
        this.estado = estado;
        this.estado.setTamagotchi(this);
    }

    public void alimentar() {
        this.estado.alimentar();
    }

    public void dormir() {
        this.estado.dormir();
    }

    public void jugar() {
        this.estado.jugar();
    }

    public void comoEstas() {
        this.estado.comoEstas();
    }
}