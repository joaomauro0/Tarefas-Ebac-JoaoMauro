public abstract class Car<T, E, K> {

    private T name;
    private E color;
    private K km;

    public Car(T name, E color, K km) {
        this.name = name;
        this.color = color;
        this.km = km;
    }

    public void info() {
        System.out.println("The car " + name + " Has the color - " + color + " and your máx km is - " + km);
    }

    public T getName() {
        return name;
    }

    public E getColor() {
        return color;
    }

    public K getKm() {
        return km;
    }

}
