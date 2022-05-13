public class Persona {
    // String nome = "Luca";
    // String cognome = "Rossi";
    // int eta = 25;
    // String colore = "blue";

    // void saluta (){
    //     System.out.println(nome);
    // }
    // void cammina(){
    //     System.out.println("sto camminando...");
    // }
    String nome;
    String cognome;
    int eta;
    String colore;

    //chiamato automaticamente
    Persona(String nome, String cognome, int eta, String colore){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.colore = colore;
    }
}
