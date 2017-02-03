
package jahazielmoreno_lab3;

import java.util.ArrayList;


public class Clientes extends Personas{
    
    protected int Dinero;
    protected ArrayList <Carro> c = new ArrayList();

    public Clientes(int Dinero, String Nombre, String Id, int edad, int altura, int peso) {
        super(Nombre, Id, edad, altura, peso);
        this.Dinero = Dinero;
    }

    public Clientes() {
        super();
    }

    public int getDinero() {
        return Dinero;
    }

    public void setDinero(int Dinero) {
        this.Dinero = Dinero;
    }

    public ArrayList<Carro> getC() {
        return c;
    }

    public void setC(ArrayList<Carro> c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return super.toString()+"Clientes{" + "Dinero=" + Dinero + ", c=" + c + '}';
    }

    
    
    
    
    
    
    
}
