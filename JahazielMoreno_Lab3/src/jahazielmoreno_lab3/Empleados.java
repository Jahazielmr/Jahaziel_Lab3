package jahazielmoreno_lab3;

public class Empleados extends Personas{
    
    protected int Nhoras;
    protected Clientes cliente;

    public Empleados() {
        super();
    }

    public Empleados(int Nhoras, Clientes cliente, String Nombre, String Id, int edad, int altura, int peso) {
        super(Nombre, Id, edad, altura, peso);
        this.Nhoras = Nhoras;
        this.cliente = cliente;
    }

    public int getNhoras() {
        return Nhoras;
    }

    public void setNhoras(int Nhoras) {
        this.Nhoras = Nhoras;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return super.toString()+"Empleados{" + "Nhoras=" + Nhoras + ", cliente=" + cliente + '}';
    }
    
    
    
    
    
    
    
}
