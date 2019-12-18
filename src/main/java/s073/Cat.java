package s073;

public class Cat extends Mammal { // anche mammal astratta ( vedi Mammal) io non lo dico quindi qui è concreta
    private Tail tail;

    public Cat(int gestationDays, int tailLen) { // costruttore
        super(gestationDays);
        this.tail = new Tail(tailLen);
    }

    @Override
    public String toString() {
        return "Cat [tail=" + tail + ", gestation=" + gestation + "]";
    }
}
