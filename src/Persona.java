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

    void saluta(){
        int prova = 5; //dentro al metodo, non funziona fuori
        System.out.println(prova);
    }

    void addizione(int a, int b){
        int risultato = a + b;
        this.qwerty(risultato);
    }
    void qwerty(int prova){
        System.out.println(prova);
    }

    public String toString(){
        String stringa = this.nome + "\n" + this.cognome + "\n" + this.eta + "\n" + this.colore;
        return stringa;
    }
}
