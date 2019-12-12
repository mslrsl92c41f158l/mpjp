package s044;

public class Loops {
	public static void main(String[] args) { // anche se è un array di  interi qui mettiamo String e args perchè quando inizia la JVM usa la Classe Loops e cerca il metodo main
		                                     //e si aspetta degli argomenti (args) che sono dei parametri di tipo stringa che JVM si aspetta. String sta ad indicare il tipo di variabile.//  
		int[] data = { 5, 7, 1, 3, 4, 87 };
		System.out.print("[");

		
		
//nel for si procede prima a dare tutte le istruzioni e se voglio fare delle specificazioni o delle eccezioni posso usare l'IF//
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);// il metodo prntln deve essere invocato dentro il loop; quindi dentro al loop apro le graffe e ci metto il metodo invocato.
			if (i < data.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		System.out.print("[");

// nel while c'è solo la condizione, tutto il resto è fuori dal loop. Quindi sia l'inizializzazione ( ecco perchè potrò usare la "i" anche sotto), sia l'incrementazione delle i ( cioe l'"i++")//		
		int i = 0;
		while (i < data.length) {
			System.out.print(data[i]);
			i++;
			if (i < data.length)
				System.out.print(", ");
		}

		System.out.println("]");
		System.out.print("[");

// nel For each invece è tutto implicito: infatti la definizione di item è dentro il loop. Va bene quando non importa la posizione infatti non posso differenziare i singoli data  enon posso non mettere la "," dopo l'ultimo.//
		for (int item : data) {
			System.out.print(item + " ");

		}

		System.out.println("]");
		System.out.println("the end!");
		
		//Controlla se c'è un elemento che vale 1 e  se c'è 7 e se si in che posizione?
		
			

	}
}

