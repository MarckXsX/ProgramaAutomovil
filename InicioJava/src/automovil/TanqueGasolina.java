package automovil;

public class TanqueGasolina {
    private int capacidad;

    public TanqueGasolina(){
        this.capacidad = 40;
    }

    public TanqueGasolina(int capacidad){
        this.capacidad = capacidad;
    }

    public int getCapacidad(){
        return capacidad;
    }
}
