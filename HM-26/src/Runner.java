public class Runner {
    public static void main(String[] args) {
            Microwave microwave = new Microwave(220);
            Fridge fridge = new Fridge(2);
            Lamp lamp = new Lamp("Ильича");
            microwave.power_socket(true);
            System.out.println(microwave.toString());
            fridge.power_socket(false);
            System.out.println(fridge.toString());
            lamp.power_socket(true);
            System.out.println(lamp.toString());
    }
}
