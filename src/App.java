public class App {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona("angelo", "dalo", 33, "verde");
        Persona persona2 = new Persona("ciro", "neri", 33, "verder");
        System.out.println(persona1.cognome);
        System.out.println(persona2.cognome);
    }
}
