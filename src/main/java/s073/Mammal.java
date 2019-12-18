package s073;

public abstract class Mammal { // non posso vreare oggetti perchè la classe è astratat
    protected int gestation;

    public Mammal(int gestation) { // è un metodo costruttore perchè ha lo stesso nome della classe  gestation è un parametro
        this.gestation = gestation; //   this è come se fosse un reference all'oggetto corrente e gestation blu è una proprietà
    }

    @Override     // significa che il metodo è già stato definito 
    public String toString() {
        return "Mammal [gestation=" + gestation + "]";
    }
}
