import tech.Techno;

public class Microwave extends Techno {
    private int wt;
    Microwave(int wt){
        super("Микроволновка " ,"черный", 15,"металл");
        this.wt = wt;
    }

    @Override
    public String toString() {
        return "Microwave{" +
                "wt=" + wt +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", material='" + material + '\'' +
                '}';
    }
}
