public class App {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona("angelo", "dalo", 33, "verde");
        Persona persona2 = new Persona("ciro", "neri", 33, "verde");
        System.out.println(persona1.toString()); //solo così senza funzione stampa la collocazione in memoria
        // System.out.println(persona1.cognome);
        // System.out.println(persona2.cognome);
        persona1.saluta();
        persona1.addizione(5, 2);
        persona1.qwerty(3);
    }
}
