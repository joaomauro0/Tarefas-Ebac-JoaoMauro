public abstract class Car {

    private String color;
    private String engine;
    private double displacement;
    private String modelo;

    public void car(String color, String engine, double displacement, String modelo) {
        this.color = color;
        this.engine = engine;
        this.displacement = displacement;
        this.modelo = modelo;
    }

    public void LigarCarro() {
        System.out.println("your car" + modelo + engine + ("it's on, with the displacement of: " + displacement));
    }

    public void LimparCarro() {
        System.out.println("your car is brand new, the" + color + ("is more") + color);

    }
}
