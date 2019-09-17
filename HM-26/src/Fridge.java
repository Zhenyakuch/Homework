import tech.Techno;

public class Fridge extends Techno {
    private int camer;
    Fridge(int camer){
        super("Холодильник ", "красный", 85, "металл");
        this.camer = camer;
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "camer=" + camer +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", material='" + material + '\'' +
                '}';
    }
}
