//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      IngressoVip vip = new IngressoVip("rio", 200, 100);
      vip.info();

      // outro
        System.out.println("-----------------------------------------------------------------");
        Ingresso in = new Ingresso("São Paulo", 50);
        in.info();

    }
}