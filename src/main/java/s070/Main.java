package s070;

public class Main {
    public static void main(String[] args) {
        Barker[] barkers = new Barker[2];
        
        barkers[0] = new Fox();
        barkers[1] = new Dog();      // il Dog è sullo heap e il suo reference

        for(Barker barker: barkers) {              // chiamo il metodo bark che nn è definito  ma è specifico per la classe Dog.
            System.out.println(barker.bark());
        }
        
        BarkAndWag baw = new Dog();
        System.out.println(baw.tailWaggingSpeed());

        Dog dog = new Dog();
        System.out.println(dog.bark(3));
    }
}
