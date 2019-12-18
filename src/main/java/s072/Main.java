package s072;

public class Main {
    public static void main(String[] args) {
        // Cannot instantiate
//        Abstract ma = new Abstract();
//        Abstract2 ma2 = new Abstract2();

        Abstract ma = new Concrete(); // qui ho creato un oggetto concreto e ho detto: "trattalo come astratto"
        ma.anAbstractMethod();

        Abstract2 ma2 = new Concrete2();
        ma2.aConcreteMethod();
    }
}
