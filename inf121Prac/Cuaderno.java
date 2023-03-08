import java.util.*;
public class Cuaderno {

    private String marca;
    private double precio;
    private int nroHojas;
    private String tamanio;

    public void leer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese datos: ");
        System.out.print("Marca: ");
        this.marca = sc.next();
        System.out.print("Precio: ");
        this.precio = sc.nextDouble();
        System.out.print("Nro Hojas: ");
        this.nroHojas = sc.nextInt();
        System.out.print("Tamaño: ");
        this.tamanio = sc.next();
                
    }

    public void mostrar(){
        System.out.println("marca = "+this.marca);
        System.out.println("precio = "+this.precio);
        System.out.println("nroHojas = "+this.nroHojas);
        System.out.println("tamaño = "+this.tamanio);
        
    }

    public String setMarca(){
        return marca;
    }
    public static void main(String[] args) {

        Cuaderno c1 = new Cuaderno();
        Cuaderno c2 = new Cuaderno();
        c1.leer();
        c1.mostrar();
        System.out.println("=========================================");
        c2.leer();
        c2.mostrar();
        
    }
    
}
