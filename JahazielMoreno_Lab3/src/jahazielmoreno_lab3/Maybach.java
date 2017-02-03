package jahazielmoreno_lab3;

import java.awt.Color;
import java.util.Date;

public class Maybach extends Carro {

    private int NllantasR;
    
    public Maybach() {
        super();
    }

    public Maybach(int NllantasR, int NumeroSerie, int Vmaxima, int KmGalon, int precioVenta, String marcallantas, String Polarizado, Color color, Date fechaEnsamblaje) {
        super(NumeroSerie, Vmaxima, KmGalon, precioVenta, marcallantas, Polarizado, color, fechaEnsamblaje);
        this.NllantasR = NllantasR;
    }

    

    public int getNllantasR() {
        return NllantasR;
    }

    public void setNllantasR(int NllantasR) {
        this.NllantasR = NllantasR;
    }


    @Override
    public String toString() {
        return super.toString() + "Maybach{" + "NllantasR=" + NllantasR + '}';
    }

}
