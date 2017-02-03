package jahazielmoreno_lab3;

import java.awt.Color;
import java.util.Date;

public class FiskerAutomotive extends Carro{
    protected String convertible, tipo;

    public FiskerAutomotive() {
        super();
    }

    public FiskerAutomotive(String convertible, String tipo, int NumeroSerie, int Vmaxima, int KmGalon, int precioVenta, String marcallantas, String Polarizado, Color color, Date fechaEnsamblaje) {
        super(NumeroSerie, Vmaxima, KmGalon, precioVenta, marcallantas, Polarizado, color, fechaEnsamblaje);
        this.convertible = convertible;
        this.tipo = tipo;
    }


    public String getConvertible() {
        return convertible;
    }

    public void setConvertible(String convertible) {
        this.convertible = convertible;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString()+"FiskerAutomotive{" + "convertible=" + convertible + ", tipo=" + tipo + '}';
    }
    
    
    
    
    
    
    
    
    
    
}
