package jahazielmoreno_lab3;

import javax.swing.JOptionPane;


public class Personas {
    protected String Nombre, Id;
    protected int edad, altura, peso;

    public Personas() {
    }

    
    public Personas(String Nombre, String Id, int edad, int altura, int peso) {
        this.Nombre = Nombre;
        this.Id = Id;
        if (edad>=18){
        this.edad = edad;
        }
        if (altura >=155){
            this.altura = altura;
        }
        if (peso >=120){
            this.peso = peso;
        }
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad>=18){
            this.edad = edad;
        } else{
            JOptionPane.showMessageDialog(null, "mas de 18");
           
        }
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        if (altura >=155){
            this.altura = altura;
        } else{
            JOptionPane.showMessageDialog(null, "mas de 155");
        }
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        if (peso >=120){
            this.peso = peso;
        }  else{
            JOptionPane.showMessageDialog(null, "mas de 120");
        }
    }

    @Override
    public String toString() {
        return "Personas{" + "Nombre=" + Nombre + ", Id=" + Id + ", edad=" + edad + ", altura=" + altura + ", peso=" + peso + '}';
    }
    
    
   
    
}
