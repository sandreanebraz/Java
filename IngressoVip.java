public class IngressoVip extends Ingresso{
    public double adicional;

    public IngressoVip(String nome, double valor, double adicional) {
        super(nome, valor);
        this.adicional = adicional;
    }
    @Override
    public void info(){
        super.info();
        System.out.println("Valor" + valor);
        System.out.println("total do igresso:"+ (valor + adicional));
    }
}
