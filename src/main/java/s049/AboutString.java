package s049;

public class AboutString {
    public static void main(String[] args) {
        String s = "hello";
        String t = "world";
        String u = "or";
        System.out.println("s, t, u: " + s + ", " + t + ", " + u);

        System.out.println("char at position 1 in s: " + s.charAt(1));// stiamo chiamando il metodo charAt sulla stringa s e mi aspetto che stampi il carattare nella posizione 1, quindi (e).

        System.out.println("s < t: " + s.compareTo(t)); // il "compare" tra due parole (stringhe) avviene in ordine alfabetico normale; il numero che esce è la distanza tra le due lettere
        System.out.println("t > s: " + t.compareTo(s));

        System.out.println("concat s and t: " + s.concat(t));// viene risolta come se fosse un semplice "+"

        System.out.println("t contains u?" + t.contains(u)); // t è la stringa che contiene la parola world e con qst metodo controlliamo se la parolo contiene o meno il char u. ritorna true or false

        String u2 = t.substring(1, 3); // sottostringa è una parte della stringa inclusa tra gli indici indicati. Il primo è incluso l'ultimo no.
        System.out.println("u2 = t.substring(1, 3): " + u2);
        System.out.println("t.substring(3): " + t.substring(3)); // è come se generasse una nuova stringa che parte dagli elem indicati; in qst caso da 3 fino alla fine della parola

        System.out.println("u equals u2? " + u.equals(u2));// qui si va a vedere il contenuto.
        System.out.println("u == u2? " + (u == u2));// non è la stessa cosa perchè essendo 2 stringhe sto andando a confrontare due references di due oggetti diversi, perciò non saranno uguali

        System.out.println("First index of 'l' is s: " + s.indexOf('l'));// sto andando a cercare l'indice di un det. carattere
        System.out.println("Last index of 'l' is s: " + s.lastIndexOf('l'));//idem
        System.out.println("there is no 'x' in s: " + s.indexOf('x'));
        System.out.println("in s \"ll\" starts at " + s.indexOf("ll"));
        System.out.println("there is no \"lx\" in s: " + s.indexOf("lx"));

        System.out.println("check if an empty string is empty: " + "".isEmpty());// per controllare se la stringa è vuota

        System.out.println("s length: " + s.length());// per controllare la lunghezza di una stringa; negli array è una proprietà ( perciò non ha () a seguire) nelle stringhe è un metodo

        String s2 = s.replace('l', 'q');
        System.out.println("Replacing 'l' with 'q': " + s + " -> " + s2);

        String[] splits = "one for me, one for you".split(" ");//trasforma la stringa in un array di stringhe e passa, quello che gli passo come parametro come divisore. dentro agli apici metti il carattere che vuoi usare come separatore che non viene rappresentato.
        System.out.println("Splitting: ");
        for (String token : splits) {// token = riga dell'array
            System.out.println(token);
        }
        String joined = String.join(" ", splits);// è un metodo statico e fa esattamente l'opposto del metodo split. Passo un array di striche definisco un congiuntore
        System.out.println("Joining back [" + joined + "]");

        System.out.println("upper: " + s.toUpperCase());// non cambia la stringa ma ne copia una in maiuscolo
        System.out.println("lower: " + "SHUT UP!".toLowerCase());// esattamente il contrario di sopra

        System.out.println("trim [" + " la la la ".trim() + "]");// elimina gli spazi bianchi all'inizio e alla fine
        
        String x = null;
        System.out.println("Sort of safe toString(): " + String.valueOf(x));// metodo statico che converte qualunque oggetto in una stringa, viene infatti chiamato factory
    }
}
