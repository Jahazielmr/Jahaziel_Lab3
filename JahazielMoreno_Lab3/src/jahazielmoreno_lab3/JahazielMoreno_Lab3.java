package jahazielmoreno_lab3;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class JahazielMoreno_Lab3 {

    public static void main(String[] args) {
        String option = "";
        ArrayList<Personas> personas = new ArrayList();
        ArrayList <Carro> carro = new ArrayList();

        while (!option.equalsIgnoreCase("E")) {
            option = JOptionPane.showInputDialog("Tienda autos\n"
                    + "A-Personal\n"
                    + "B-Carro\n"
                    + "C-Ventas"
                    + "D-Reporte Ventas\n"
                    + "C-Salir");

            switch (option) {
                case "a":
                case "A":
                    String o = JOptionPane.showInputDialog("Personal\n"
                            + "A-Empleado\n"
                            + "B-Personal\n");

                    switch (o) {
                        case "a":
                        case "A":
                            String am = JOptionPane.showInputDialog("Empleado\n"
                                    + "A-Agregar\n"
                                    + "B-Listar\n"
                                    + "C-Modificar\n"
                                    + "D-Eliminar\n");

                            switch (am) {
                                case "a":
                                case "A":
                                    String Nombre,
                                     Id;
                                    int edad,
                                     altura,
                                     peso,
                                     Nhoras;
                                    Clientes cliente;

                                    Nombre = (JOptionPane.showInputDialog("Ingrese Nombre:"));
                                    Id = (JOptionPane.showInputDialog("Ingrese ID:"));
                                    edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad:"));
                                    altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese altura"));
                                    peso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad:"));
                                    Nhoras = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de horas"));

                                    personas.add(new Empleados(Nhoras, null, Nombre, Id, edad, altura, peso));

                                    break;

                                case "b"://Listar
                                case "B":
                                    String p = "";
                                    for (Personas tempORAL : personas) {
                                        if (tempORAL instanceof Empleados) {
                                            p += personas.toString() + "\n";
                                        }
                                    }
                                    JOptionPane.showMessageDialog(null, p);

                                    break;

                                case "c":// Modificar
                                case "C":
                                    int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion:"));
                                    
                                    for (Personas t : personas) {
                                    if(t instanceof Empleados){
                                        
                                    
                                    String Nombres,
                                     Ids;
                                    int edads,
                                     alturas,
                                     pesos,
                                     Nhorass;
                                    Clientes clientes;

                                    Nombres = (JOptionPane.showInputDialog("Ingrese nuevo Nombre:"));
                                    Ids = (JOptionPane.showInputDialog("Ingrese nuevo ID:"));
                                    edads = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nueva edad:"));
                                    alturas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nueva altura:"));
                                    pesos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nuevo peso"));
                                    Nhorass = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nuevas horas de trabajo:"));

                                    personas.get(pos).setAltura(alturas);
                                    personas.get(pos).setEdad(edads);
                                    personas.get(pos).setId(Ids);
                                    personas.get(pos).setNombre(Nombres);
                                    personas.get(pos).setPeso(pesos);
                                    ((Empleados) personas.get(pos)).setNhoras(Nhorass);
                                    }
                                    }
                                    break;
                                case "d"://Eliminar
                                case "D":
                                    int posi=Integer.parseInt(JOptionPane.showInputDialog("Posicion de empleado a eliminar "));
                                        for (Personas t : personas) {
                                    if(t instanceof Empleados){
                                        personas.remove(posi);
                                    }
                                }
                                    break;
                            }
                            break;

                        case "b"://Clientes
                        case "B":
                            String lectura = JOptionPane.showInputDialog("Cliente\n"
                                    + "A-Agregar\n"
                                    + "B-Listar\n"
                                    + "C-Modificar\n"
                                    + "D-Eliminar\n");

                            switch (lectura) {
                                case "a":
                                case "A":
                                    String Nombre,
                                     Id;
                                    int edad,
                                     altura,
                                     peso,
                                     dinero;

                                    Nombre = (JOptionPane.showInputDialog("Ingrese Nombre:"));
                                    Id = (JOptionPane.showInputDialog("Ingrese ID:"));
                                    edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad:"));
                                    altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese altura"));
                                    peso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad:"));
                                    dinero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dinero que posee"));

                                    personas.add(new Clientes(dinero, Nombre, Id, edad, altura, peso));

                                    break;

                                case "b"://Listar
                                case "B":
                                    String p = "";
                                    for (Personas tempORAL : personas) {
                                        if (tempORAL instanceof Clientes) {
                                            p += personas.toString() + "\n";
                                        }
                                    }
                                    JOptionPane.showMessageDialog(null, p);

                                    break;

                                case "c":// Modificar
                                case "C":
                                    int posi = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion:"));
                                    for (Personas t : personas) {
                                        if(t instanceof Clientes){
                                            personas.remove(posi);
                                    
                                    String Nombres,
                                     Ids;
                                    int edads,
                                     alturas,
                                     pesos,
                                     dineros;

                                    Nombres = (JOptionPane.showInputDialog("Ingrese nuevo Nombre:"));
                                    Ids = (JOptionPane.showInputDialog("Ingrese nuevo ID:"));
                                    edads = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nueva edad:"));
                                    alturas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nueva altura:"));
                                    pesos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nuevo peso"));
                                    dineros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nuevas personas:"));

                                    personas.get(posi).setAltura(alturas);
                                    personas.get(posi).setEdad(edads);
                                    personas.get(posi).setId(Ids);
                                    personas.get(posi).setNombre(Nombres);
                                    personas.get(posi).setPeso(pesos);
                                    ((Clientes) personas.get(posi)).setDinero(dineros);
                                     }
                                    }
                                    break;
                                case "d"://Eliminar
                                case "D":
                                    int pos=Integer.parseInt(JOptionPane.showInputDialog("Posicion para eliminar cliente "));
                                for (Personas t : personas) {
                                    if(t instanceof Clientes){
                                        personas.remove(pos);
                                    }
                                }
                                    break;
                            }
                            break;

                    }
                    break;

                case "B"://carros
                case "b":
                    String lea = JOptionPane.showInputDialog("Carros\n"
                            + "A-Maybach\n"
                            + "B-MorganAero8\n"
                            + "C-FiskerAutomotive\n"
                            + "D-Tramontana\n");

                    switch (lea) {
                        case "a"://Maybach
                        case "A":
                            String am = JOptionPane.showInputDialog("Maybach\n"
                                    + "A-Agregar\n"
                                    + "B-Listar\n"
                                    + "C-Modificar\n"
                                    + "D-Eliminar\n");

                            switch (am) {
                                case "a":
                                case "A":
                                    int Nllantas, Nserie, Vmaxima, Kmconsumido,Precio;
                                    Color color = new Color(Color.BITMASK);
                                    String MarcaLlantas, polarizado;
                                    Date fecha = new Date();

                                    MarcaLlantas = (JOptionPane.showInputDialog("Ingrese marca de llantas"));
                                    Nserie = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de serie:"));
                                    Vmaxima = Integer.parseInt(JOptionPane.showInputDialog("Ingrese velocidad maxima"));
                                    while (Vmaxima>=155&&Vmaxima<=160){
                                        Vmaxima = Integer.parseInt(JOptionPane.showInputDialog("Ingrese velocidad maxima"));
                                    }
                                    Kmconsumido = Integer.parseInt(JOptionPane.showInputDialog("Ingrese km consumidos por galon:"));
                                    while (Kmconsumido>=55&Kmconsumido<=55){
                                        Kmconsumido = Integer.parseInt(JOptionPane.showInputDialog("Ingrese km consumidos por galon:"));
                                    }
                                    Precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese precio de venta"));
                                    while (Precio>=400000&&Precio<=600000){
                                     Precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese precio de venta"));   
                                    }
                                    Nllantas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de llantas 1 /2"));
                                    while (Nllantas==1||Nllantas==2){
                                        Nllantas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de llantas 1 /2"));
                                    }
                                    polarizado = (JOptionPane.showInputDialog("es polarizado si / no"));
                                    while (polarizado.equals("si")||polarizado.equals("no")){
                                        polarizado = (JOptionPane.showInputDialog("es polarizado si / no"));
                                    }
                                    carro.add(new Maybach(Nllantas, Nserie, Vmaxima, Kmconsumido, Precio, MarcaLlantas, polarizado, color, fecha));

                                    break;

                                case "b"://Listar
                                case "B":
                                    String p = "";
                                    for (Object tempORAL : carro) {
                                        if (tempORAL instanceof Maybach) {
                                            p += carro.toString() + "\n";
                                        }
                                    }
                                    JOptionPane.showMessageDialog(null, p);

                                    break;

                                case "c":// Modificar
                                case "C":
                                    int posic = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion:"));
                                    for (Carro t : carro) {
                                        if(t instanceof Maybach){
                                            carro.remove(posic);
                                        
                                    
                                    Date fech = new Date();
                                    int Nllantass, Nseries, Vmaximas, Kmconsumidos,Precios;
                                    Color colors= new Color(Color.BITMASK);
                                    String MarcaLlantass, polarizados;

                                    MarcaLlantass = (JOptionPane.showInputDialog("Ingrese marca de llantas"));
                                    Nseries = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de serie:"));
                                    Vmaximas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese velocidad maxima"));
                                    while (Vmaximas>=155&&Vmaximas<=160){
                                        Vmaximas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese velocidad maxima"));
                                    }
                                    Kmconsumidos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese km consumidos por galon:"));
                                    while (Kmconsumidos>=55&Kmconsumidos<=55){
                                        Kmconsumidos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese km consumidos por galon:"));
                                    }
                                    Precios = Integer.parseInt(JOptionPane.showInputDialog("Ingrese precio de venta"));
                                    while (Precios>=400000&&Precios<=600000){
                                     Precios = Integer.parseInt(JOptionPane.showInputDialog("Ingrese precio de venta"));   
                                    }
                                    Nllantass = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de llantas 1 /2"));
                                    while (Nllantass==1||Nllantass==2){
                                        Nllantass = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de llantas 1 /2"));
                                    }
                                    polarizados = (JOptionPane.showInputDialog("es polarizado si / no"));
                                    while (polarizados.equals("si")||polarizados.equals("no")){
                                        polarizados = (JOptionPane.showInputDialog("es polarizado si / no"));
                                    }
                                    
                                    carro.get(posic).setColor(colors);
                                    carro.get(posic).setKmGalon(Precios);
                                    carro.get(posic).setFechaEnsamblaje(fech);
                                    carro.get(posic).setMarcallantas(MarcaLlantass);
                                    carro.get(posic).setPrecioVenta(Precios);
                                    carro.get(posic).setPolarizado(polarizados);
                                    carro.get(posic).setNumeroSerie(Nseries);
                                    carro.get(posic).setVmaxima(Vmaximas);
                                    ((Maybach) carro.get(posic)).setNllantasR(Nllantass);
                                        }
                                    }
                                    break;
                                case "d"://Eliminar
                                case "D":
                                    int pos=Integer.parseInt(JOptionPane.showInputDialog("Posicion del Maybach "));
                                        for (Carro t : carro) {
                                            if(t instanceof Maybach){
                                                carro.remove(pos);
                                            }
                                        }
                                        
                                    break;
                            }
                            break;

                        case "b":// MorganAero8
                        case "B":
                            String leer = JOptionPane.showInputDialog("MorganAero8\n"
                                    + "A-Agregar\n"
                                    + "B-Listar\n"
                                    + "C-Modificar\n"
                                    + "D-Eliminar\n");

                            switch (leer) {
                                case "a":
                                case "A":
                                    int NSeries, Vmax, Kmconsumido,Preci;
                                    Color colo = new Color(Color.BITMASK);
                                    String MarcaLlant, convertible, cabina, pola;
                                    Date fecha = new Date();

                                    MarcaLlant = (JOptionPane.showInputDialog("Ingrese marca de llantas"));
                                    NSeries = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de serie:"));
                                    Vmax= Integer.parseInt(JOptionPane.showInputDialog("Ingrese velocidad maxima"));
                                    while (Vmax>=140&&Vmax<=145){
                                        Vmax = Integer.parseInt(JOptionPane.showInputDialog("Ingrese velocidad maxima"));
                                    }
                                    Kmconsumido = Integer.parseInt(JOptionPane.showInputDialog("Ingrese km consumidos por galon:"));
                                    while (Kmconsumido>=35&Kmconsumido<=40){
                                        Kmconsumido = Integer.parseInt(JOptionPane.showInputDialog("Ingrese km consumidos por galon:"));
                                    }
                                    Preci = Integer.parseInt(JOptionPane.showInputDialog("Ingrese precio de venta"));
                                    while (Preci>=500000&&Preci<=700000){
                                     Preci = Integer.parseInt(JOptionPane.showInputDialog("Ingrese precio de venta"));   
                                    }
                                    
                                    convertible= (JOptionPane.showInputDialog("Es convertible o no si /no"));
                                    while (convertible.equalsIgnoreCase("si")||convertible.equalsIgnoreCase("no")){
                                        convertible= (JOptionPane.showInputDialog("Es convertible o no si /no"));
                                    }
                                    
                                    cabina= (JOptionPane.showInputDialog("Es cabina doble o sencilla"));
                                    while (cabina.equalsIgnoreCase("Doble")||cabina.equalsIgnoreCase("Sencilla")){
                                        cabina= (JOptionPane.showInputDialog("Es convertible o no si /no"));
                                    }
                                    pola = (JOptionPane.showInputDialog("es polarizado si / no"));
                                    while (pola.equals("si")||pola.equals("no")){
                                        pola = (JOptionPane.showInputDialog("es polarizado si / no"));
                                    }
                                    
                                    carro.add(new MorganAero8(convertible, cabina, NSeries, Vmax, Kmconsumido, Preci, MarcaLlant, pola, colo, fecha));

                                    break;

                                case "b"://Listar
                                case "B":
                                    String s = "";
                                    for (Object tempORAL : carro) {
                                        if (tempORAL instanceof MorganAero8) {
                                            s += carro.toString() + "\n";
                                        }
                                    }
                                    JOptionPane.showMessageDialog(null, s);

                                    break;

                                case "c":// Modificar
                                case "C":
                                    int posic = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion:"));
                                    for (Carro t : carro) {
                                        if(t instanceof Maybach){
                                            carro.remove(posic);
                                    int NSeriess, Vmaxs, Kmconsumidos,Precis;
                                    Color colos = new Color(Color.BITMASK);
                                    String MarcaLlants, convertibles, cabinas, polas;
                                    Date fechas = new Date();

                                    MarcaLlants = (JOptionPane.showInputDialog("Ingrese marca de llantas"));
                                    NSeriess = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de serie:"));
                                    Vmaxs= Integer.parseInt(JOptionPane.showInputDialog("Ingrese velocidad maxima"));
                                    while (Vmaxs>=140&&Vmaxs<=145){
                                        Vmaxs = Integer.parseInt(JOptionPane.showInputDialog("Ingrese velocidad maxima"));
                                    }
                                    Kmconsumidos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese km consumidos por galon:"));
                                    while (Kmconsumidos>=35&Kmconsumidos<=40){
                                        Kmconsumidos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese km consumidos por galon:"));
                                    }
                                    Precis = Integer.parseInt(JOptionPane.showInputDialog("Ingrese precio de venta"));
                                    while (Precis>=500000&&Precis<=700000){
                                     Precis = Integer.parseInt(JOptionPane.showInputDialog("Ingrese precio de venta"));   
                                    }
                                    
                                    convertibles= (JOptionPane.showInputDialog("Es convertible o no si /no"));
                                    while (convertibles.equalsIgnoreCase("si")||convertibles.equalsIgnoreCase("no")){
                                        convertibles= (JOptionPane.showInputDialog("Es convertible o no si /no"));
                                    }
                                    
                                    cabinas= (JOptionPane.showInputDialog("Es cabina doble o sencilla"));
                                    while (cabinas.equalsIgnoreCase("Doble")||cabinas.equalsIgnoreCase("Sencilla")){
                                        cabinas = (JOptionPane.showInputDialog("Es convertible o no si /no"));
                                    }
                                    polas = (JOptionPane.showInputDialog("es polarizado si / no"));
                                    while (polas.equals("si")||polas.equals("no")){
                                        polas = (JOptionPane.showInputDialog("es polarizado si / no"));
                                    }
                                    
                                    carro.get(posic).setColor(colos);
                                    carro.get(posic).setKmGalon(Kmconsumidos);
                                    carro.get(posic).setFechaEnsamblaje(fechas);
                                    carro.get(posic).setMarcallantas(MarcaLlants);
                                    carro.get(posic).setPrecioVenta(Precis);
                                    carro.get(posic).setPolarizado(polas);
                                    carro.get(posic).setNumeroSerie(NSeriess);
                                    carro.get(posic).setVmaxima(Vmaxs);
                                    ((MorganAero8) carro.get(posic)).setConvertible(convertibles);
                                    ((MorganAero8) carro.get(posic)).setCabina(cabinas);
                                    
                                     }
                                    }
                                    break;
                                case "d"://Eliminar
                                case "D":
                                    int pos=Integer.parseInt(JOptionPane.showInputDialog("Posicion del a eliminar Morgan "));
                                        for (Carro t : carro) {
                                            if(t instanceof MorganAero8){
                                                carro.remove(pos);
                                            }
                                        }
                                        
                                    break;
                            }
                            break;
                            
                        case "c":// FiskerAutomotive
                        case "C":
                            String ls = JOptionPane.showInputDialog("FiskerAutomotive\n"
                                    + "A-Agregar\n"
                                    + "B-Listar\n"
                                    + "C-Modificar\n"
                                    + "D-Eliminar\n");

                            switch (ls) {
                                case "a":
                                case "A":
                                    int NSeries, Vmax, Kmconsumido,Preci;
                                    Color colo = new Color(Color.BITMASK);
                                    String MarcaLlant, convertible, pola, tipo;
                                    Date fecha = new Date();

                                    tipo = (JOptionPane.showInputDialog("Ingrese tipo camioneta/turismo"));
                                    while (tipo.equalsIgnoreCase("turismo")||tipo.equalsIgnoreCase("camioneta")){
                                        tipo= (JOptionPane.showInputDialog("Ingrese tipo camioneta/turismo"));
                                    }
                                    MarcaLlant = (JOptionPane.showInputDialog("Ingrese marca de llantas"));
                                    NSeries = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de serie:"));
                                    Vmax= Integer.parseInt(JOptionPane.showInputDialog("Ingrese velocidad maxima"));
                                    while (Vmax>=160&&Vmax<=165){
                                        Vmax = Integer.parseInt(JOptionPane.showInputDialog("Ingrese velocidad maxima"));
                                    }
                                    Kmconsumido = Integer.parseInt(JOptionPane.showInputDialog("Ingrese km consumidos por galon:"));
                                    while (Kmconsumido>=55&Kmconsumido<=60){
                                        Kmconsumido = Integer.parseInt(JOptionPane.showInputDialog("Ingrese km consumidos por galon:"));
                                    }
                                    Preci = Integer.parseInt(JOptionPane.showInputDialog("Ingrese precio de venta"));
                                    while (Preci>=450000&&Preci<=650000){
                                     Preci = Integer.parseInt(JOptionPane.showInputDialog("Ingrese precio de venta"));   
                                    }
                                    
                                    convertible= (JOptionPane.showInputDialog("Es convertible o no si /no"));
                                    while (convertible.equalsIgnoreCase("si")||convertible.equalsIgnoreCase("no")){
                                        convertible= (JOptionPane.showInputDialog("Es convertible o no si /no"));
                                    }
                                    
                                    pola = (JOptionPane.showInputDialog("es polarizado si / no"));
                                    while (pola.equals("si")||pola.equals("no")){
                                        pola = (JOptionPane.showInputDialog("es polarizado si / no"));
                                    }
                                    
                                    
                                    carro.add(new FiskerAutomotive(convertible, tipo, NSeries, Vmax, Kmconsumido, Preci, MarcaLlant, pola, colo, fecha));

                                    break;

                                case "b"://Listar
                                case "B":
                                    String s = "";
                                    for (Carro tempORAL : carro) {
                                        if (tempORAL instanceof FiskerAutomotive) {
                                            s += carro.toString() + "\n";
                                        }
                                    }
                                    JOptionPane.showMessageDialog(null, s);

                                    break;

                                case "c":// Modificar
                                case "C":
                                    int posic = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion:"));
                                    for (Carro t : carro) {
                                        if(t instanceof Maybach){
                                            carro.remove(posic);
                                    int NSerie, Vma, Kmconsumid,Prec;
                                    Color col = new Color(Color.BITMASK);
                                    String MarcaLlan, convertibl, pol, tip;
                                    Date fech = new Date();

                                    tip = (JOptionPane.showInputDialog("Ingrese tipo camioneta/turismo"));
                                    while (tip.equalsIgnoreCase("turismo")||tip.equalsIgnoreCase("camioneta")){
                                        tip= (JOptionPane.showInputDialog("Ingrese tipo camioneta/turismo"));
                                    }
                                    MarcaLlan = (JOptionPane.showInputDialog("Ingrese marca de llantas"));
                                    NSerie = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de serie:"));
                                    Vma= Integer.parseInt(JOptionPane.showInputDialog("Ingrese velocidad maxima"));
                                    while (Vma>=160&&Vma<=165){
                                        Vma = Integer.parseInt(JOptionPane.showInputDialog("Ingrese velocidad maxima"));
                                    }
                                    Kmconsumid = Integer.parseInt(JOptionPane.showInputDialog("Ingrese km consumidos por galon:"));
                                    while (Kmconsumid>=55&Kmconsumid<=60){
                                        Kmconsumid = Integer.parseInt(JOptionPane.showInputDialog("Ingrese km consumidos por galon:"));
                                    }
                                    Prec = Integer.parseInt(JOptionPane.showInputDialog("Ingrese precio de venta"));
                                    while (Prec>=450000&&Prec<=650000){
                                     Prec = Integer.parseInt(JOptionPane.showInputDialog("Ingrese precio de venta"));   
                                    }
                                    
                                    convertibl= (JOptionPane.showInputDialog("Es convertible o no si /no"));
                                    while (convertibl.equalsIgnoreCase("si")||convertibl.equalsIgnoreCase("no")){
                                        convertibl= (JOptionPane.showInputDialog("Es convertible o no si /no"));
                                    }
                                    
                                    pol = (JOptionPane.showInputDialog("es polarizado si / no"));
                                    while (pol.equals("si")||pol.equals("no")){
                                        pol = (JOptionPane.showInputDialog("es polarizado si / no"));
                                    }
                                    
                                    carro.get(posic).setColor(col);
                                    carro.get(posic).setKmGalon(Kmconsumid);
                                    carro.get(posic).setFechaEnsamblaje(fech);
                                    carro.get(posic).setMarcallantas(MarcaLlan);
                                    carro.get(posic).setPrecioVenta(Prec);
                                    carro.get(posic).setPolarizado(pol);
                                    carro.get(posic).setNumeroSerie(NSerie);
                                    carro.get(posic).setVmaxima(Vma);
                                    ((FiskerAutomotive) carro.get(posic)).setConvertible(convertibl);
                                    ((FiskerAutomotive) carro.get(posic)).setTipo(tip);
                                        }
                                    }
                                    break;
                                case "d"://Eliminar
                                case "D":
                                    int pos=Integer.parseInt(JOptionPane.showInputDialog("Posicion del a eliminar Morgan "));
                                        for (Carro t : carro) {
                                            if(t instanceof FiskerAutomotive){
                                                carro.remove(pos);
                                            }
                                        }
                                        
                                    break;
                            }
                            
                            break;
                            

                        case "d"://tramontana
                        case "D":
                            String le = JOptionPane.showInputDialog("Tramontana\n"
                                    + "A-Agregar\n"
                                    + "B-Listar\n"
                                    + "C-Modificar\n"
                                    + "D-Eliminar\n");

                            switch (le) {
                                case "a":
                                case "A":
                                    int NSeries, Vmax, Kmconsumido,Preci, peso;
                                    Color colo = new Color(Color.BITMASK);
                                    String MarcaLlant,transmision, pola;
                                    Date fecha = new Date();

                                    
                                    MarcaLlant = (JOptionPane.showInputDialog("Ingrese marca de llantas"));
                                    NSeries = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de serie:"));
                                    Vmax= Integer.parseInt(JOptionPane.showInputDialog("Ingrese velocidad maxima"));
                                    while (Vmax>=175&&Vmax<=180){
                                        Vmax = Integer.parseInt(JOptionPane.showInputDialog("Ingrese velocidad maxima"));
                                    }
                                    Kmconsumido = Integer.parseInt(JOptionPane.showInputDialog("Ingrese km consumidos por galon:"));
                                    while (Kmconsumido>=50&Kmconsumido<=55){
                                        Kmconsumido = Integer.parseInt(JOptionPane.showInputDialog("Ingrese km consumidos por galon:"));
                                    }
                                    Preci = Integer.parseInt(JOptionPane.showInputDialog("Ingrese precio de venta"));
                                    while (Preci>=800000&&Preci<=1000000){
                                     Preci = Integer.parseInt(JOptionPane.showInputDialog("Ingrese precio de venta"));   
                                    }
                                                                      
                                    peso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese preso"));
                                    
                                    pola = (JOptionPane.showInputDialog("es polarizado si / no"));
                                    while (pola.equals("si")||pola.equals("no")){
                                        pola = (JOptionPane.showInputDialog("es polarizado si / no"));
                                    }
                                    transmision = (JOptionPane.showInputDialog("Ingrese transmision 6/7"));
                                    while (transmision.equals("6")||transmision.equals("7")){
                                        transmision = (JOptionPane.showInputDialog("Ingrese transmision 6/7"));
                                    }
                                    
                                    carro.add(new Tramontana(peso, transmision, NSeries, Vmax, Kmconsumido, Preci, MarcaLlant, pola, colo, fecha));
                                    break;

                                case "b"://Listar
                                case "B":
                                    String s = "";
                                    for (Carro tempORAL : carro) {
                                        if (tempORAL instanceof Tramontana) {
                                            s += carro.toString() + "\n";
                                        }
                                    }
                                    JOptionPane.showMessageDialog(null, s);

                                    break;

                                case "c":// Modificar
                                case "C":
                                    
                                    int posic = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion:"));
                                    for (Carro t : carro) {
                                        if(t instanceof Tramontana){
                                            carro.remove(posic);
                                            
                                    int NSeri, Vm, Km,Pre, pe;
                                    Color col = new Color(Color.BITMASK);
                                    String Marca,trans, polarizadosss;
                                    Date fechas = new Date();      
                                     Marca = (JOptionPane.showInputDialog("Ingrese marca de llantas"));
                                    NSeri = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de serie:"));
                                    Vm= Integer.parseInt(JOptionPane.showInputDialog("Ingrese velocidad maxima"));
                                    while (Vm>=175&&Vm<=180){
                                        Vm = Integer.parseInt(JOptionPane.showInputDialog("Ingrese velocidad maxima"));
                                    }
                                    Km = Integer.parseInt(JOptionPane.showInputDialog("Ingrese km consumidos por galon:"));
                                    while (Km>=50&Km<=55){
                                        Km = Integer.parseInt(JOptionPane.showInputDialog("Ingrese km consumidos por galon:"));
                                    }
                                    Pre = Integer.parseInt(JOptionPane.showInputDialog("Ingrese precio de venta"));
                                    while (Pre>=800000&&Pre<=1000000){
                                     Pre = Integer.parseInt(JOptionPane.showInputDialog("Ingrese precio de venta"));   
                                    }
                                                                      
                                    pe = Integer.parseInt(JOptionPane.showInputDialog("Ingrese peso"));
                                    
                                    polarizadosss = (JOptionPane.showInputDialog("es polarizado si / no"));
                                    while (polarizadosss.equals("si")||polarizadosss.equals("no")){
                                        polarizadosss = (JOptionPane.showInputDialog("es polarizado si / no"));
                                    }
                                    trans = (JOptionPane.showInputDialog("Ingrese transmision 6/7"));
                                    while (trans.equals("6")||trans.equals("7")){
                                        trans = (JOptionPane.showInputDialog("Ingrese transmision 6/7"));
                                    }
                                    
                                    carro.get(posic).setColor(col);
                                    carro.get(posic).setKmGalon(Km);
                                    carro.get(posic).setFechaEnsamblaje(fechas);
                                    carro.get(posic).setMarcallantas(Marca);
                                    carro.get(posic).setPrecioVenta(Pre);
                                    carro.get(posic).setPolarizado(polarizadosss);
                                    carro.get(posic).setNumeroSerie(NSeri);
                                    carro.get(posic).setVmaxima(Vm);
                                    ((Tramontana) carro.get(posic)).setPeso(pe);
                                    ((Tramontana) carro.get(posic)).setTransmision(trans);
                                        }
                                    }
                                    break;
                                case "d"://Eliminar
                                case "D":
                                    int pos=Integer.parseInt(JOptionPane.showInputDialog("Posicion del a eliminar Morgan "));
                                        for (Carro t : carro) {
                                            if(t instanceof Tramontana){
                                                carro.remove(pos);
                                            }
                                        }
                                        
                                    break;
                            }
                            break;
                    }
                    
                    break;
                    
                case "c":
                case "C":
                    
                    break;

            }

        }

    }

}

