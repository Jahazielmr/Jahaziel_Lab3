package jahazielmoreno_lab3;

import java.awt.Color;
import java.util.Date;

public class Carro {
    protected int NumeroSerie, Vmaxima, KmGalon, precioVenta;
    protected String marcallantas, Polarizado;
    protected Color color;
    protected Date fechaEnsamblaje;

    public Carro() {
    }

    public Carro(int NumeroSerie, int Vmaxima, int KmGalon, int precioVenta, String marcallantas, String Polarizado, Color color, Date fechaEnsamblaje) {
        this.NumeroSerie = NumeroSerie;
        this.Vmaxima = Vmaxima;
        this.KmGalon = KmGalon;
        this.precioVenta = precioVenta;
        this.marcallantas = marcallantas;
        this.Polarizado = Polarizado;
        this.color = color;
        this.fechaEnsamblaje=fechaEnsamblaje;
    }

    
    
    
    public int getNumeroSerie() {
        return NumeroSerie;
    }

    public void setNumeroSerie(int NumeroSerie) {
        this.NumeroSerie = NumeroSerie;
    }

    public int getVmaxima() {
        return Vmaxima;
    }

    public void setVmaxima(int Vmaxima) {
        this.Vmaxima = Vmaxima;
    }

    public int getKmGalon() {
        return KmGalon;
    }

    public void setKmGalon(int KmGalon) {
        this.KmGalon = KmGalon;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getMarcallantas() {
        return marcallantas;
    }

    public void setMarcallantas(String marcallantas) {
        this.marcallantas = marcallantas;
    }

    public String getPolarizado() {
        return Polarizado;
    }

    public void setPolarizado(String Polarizado) {
        this.Polarizado = Polarizado;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Date getFechaEnsamblaje() {
        return fechaEnsamblaje;
    }

    public void setFechaEnsamblaje(Date fechaEnsamblaje) {
        this.fechaEnsamblaje = fechaEnsamblaje;
    }

    @Override
    public String toString() {
        return "Carro{" + "NumeroSerie=" + NumeroSerie + ", Vmaxima=" + Vmaxima + ", KmGalon=" 
                + KmGalon + ", precioVenta=" + precioVenta + ", marcallantas=" 
                + marcallantas + ", Polarizado=" + Polarizado + ", color=" 
                + color + ", fechaEnsamblaje=" + fechaEnsamblaje + '}';
    }
    
    
    
    
    
}
