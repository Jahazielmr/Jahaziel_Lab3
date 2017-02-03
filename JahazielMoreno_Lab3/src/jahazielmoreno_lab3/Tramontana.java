
package jahazielmoreno_lab3;
 
import java.awt.Color;
import java.util.Date;

public class Tramontana extends Carro {
    protected int peso;
    protected String transmision;

    public Tramontana() {
        super();
    }

    public Tramontana(int peso, String transmision, int NumeroSerie, int Vmaxima, int KmGalon, int precioVenta, String marcallantas, String Polarizado, Color color, Date fechaEnsamblaje) {
        super(NumeroSerie, Vmaxima, KmGalon, precioVenta, marcallantas, Polarizado, color, fechaEnsamblaje);
        if (peso>=1276&&peso<=1376){
            this.peso = peso;
        }
        this.transmision = transmision;
    }

   

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        if (peso>=1276&&peso<=1376)
        this.peso = peso;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    @Override
    public String toString() {
        return super.toString()+"Tramontana{" + "peso=" + peso + ", transmision=" + transmision + '}';
    }
    
    
    
    
    
}
