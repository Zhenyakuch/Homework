public class Runner {
    public static void main(String[] args) {
            Microwave microwave = new Microwave(220);
            Fridge fridge = new Fridge(2);
            Lamp lamp = new Lamp("Ильича");
            microwave.power_socket(true);
            fridge.power_socket(false);
            lamp.power_socket(true);
    }
}
