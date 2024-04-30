public class ComContrato extends Factory {

    Car retrieveCar(String requestedGrade) {
        if ("B".equals(requestedGrade)) {
            return new Lamborghini("Green", "V8 v 90° Twin turbo Hybrid", 3.8d, "SC63");
        } else {
            return null;
        }
    }
}
