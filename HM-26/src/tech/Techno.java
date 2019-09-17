package tech;

public abstract class Techno {

    protected   String name;
    protected  String color;
    protected  int weight;
    protected  String material;
    protected static boolean status;

      public Techno(String name, String color, int weight, String  material){
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.material = material;
    }

    public void power_socket(boolean status){
        if(status){
            System.out.println("Прибор: " + name + "Цвет: " + color + " Масса: " + weight + " Материал: " + material +   " включен в розетку");
        }else{
            System.out.println("Прибор: " + name + "Цвет: " + color + " Масса: " + weight + " Материал: " + material + " не включен в розетку");
        }

    }


}
