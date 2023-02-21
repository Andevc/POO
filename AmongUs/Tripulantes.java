import java.util.*;
public class Tripulantes {
    List<Tripulantes> listaTripulantes = new ArrayList<Tripulantes>(); 

    private String name;
    private String pet;
    private String color;
    private String hat;


    public Tripulantes(String name, String pet, String color, String hat){
        this.name = name;
        this.pet = pet;
        this.color = color;
        this.hat = hat;
    }

    public void infoTripulante(){

        System.out.println(
        "Nombre: "+this.name+
        "\nMascota: "+this.pet+
        "\nColor: "+this.color+
        "\nGorra: "+this.hat);

    } 
    public static void main(String[] args) throws Exception {
        
        Tripulantes tripulante1 = new Tripulantes("Jakc","alien","gris","huevo");

        tripulante1.infoTripulante();
    }
}
