package automovil;

public class Motor {
    private double cilindrada;
    private TipoMotor tipoMotor;

    public Motor() {
    }

    public Motor(double cilindrada, TipoMotor tipoMotor) {
        this();
        this.tipoMotor = tipoMotor;
        this.cilindrada = cilindrada;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
}
