package jahazielmoreno_lab3;

import java.awt.Color;
import java.util.Date;

public class MorganAero8 extends Carro{
    protected String convertible, cabina;

    public MorganAero8() {
        super();
    }

    public MorganAero8(String convertible, String cabina, int NumeroSerie, int Vmaxima, int KmGalon, int precioVenta, String marcallantas, String Polarizado, Color color, Date fechaEnsamblaje) {
        super(NumeroSerie, Vmaxima, KmGalon, precioVenta, marcallantas, Polarizado, color, fechaEnsamblaje);
        this.convertible = convertible;
        this.cabina = cabina;
    }

    public String getConvertible() {
        return convertible;
    }

    public void setConvertible(String convertible) {
        this.convertible = convertible;
    }

    public String getCabina() {
        return cabina;
    }

    public void setCabina(String cabina) {
        this.cabina = cabina;
    }

    @Override
    public String toString() {
        return super.toString()+"MorganAero8{" + "convertible=" + convertible + ", cabina=" + cabina + '}';
    }
    
    
    
}
