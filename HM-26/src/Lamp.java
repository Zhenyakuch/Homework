import tech.Techno;

public class Lamp extends Techno {
    private  String type_lamp;
    Lamp(String type_lamp){
        super("Настольная лампа ", "разноцветная", 3, "пластик");
        this.type_lamp = type_lamp;
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "type_lamp='" + type_lamp + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", material='" + material + '\'' +
                '}';
    }
}
