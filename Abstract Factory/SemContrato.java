public class SemContrato extends Factory {

    Car retrieveCar(String requestedGrade) 
            if ("A".equals(requestedGrade)) {
                return new chevrolet("azul", "TURBO 153 CV",2.8d, "Cruze");
            } else {
                return null;
            }
}
