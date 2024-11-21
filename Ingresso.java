public class Ingresso {
    String nome;
    Double valor;

    public Ingresso() {
    }

    public Ingresso(String nome,double valor) {
        super();
        this.nome = nome;
        this.valor = valor;

    }

    void info(){
        System.out.println("Nome do evento:" +nome);
        System.out.println("Valor do ingresso:" +valor);
    }
}
