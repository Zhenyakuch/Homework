import java.time.chrono.IsoEra;

public class Techno {

    private static String name;
    private static String color;
    private static int weight;
    private static String material;
    private static boolean status;

      Techno(String name, String color, int weight, String  material){
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.material = material;
    }

    void power_socket(boolean status){
        if(status){
            System.out.println("Прибор: " + name + "Цвет: " + color + " Масса: " + weight + " Материал: " + material +  " включен в розетку");
        }else{
            System.out.println("Прибор: " + name + "Цвет: " + color + " Масса: " + weight + " Материал: " + material + " не включен в розетку");
        }

    }

    public static void main(String[] args) {
        Microwave microwave = new Microwave();
        Fridge fridge = new Fridge();
        Lamp lamp = new Lamp();
        microwave.power_socket(true);
        fridge.power_socket(false);
        lamp.power_socket(true);



    }
}
