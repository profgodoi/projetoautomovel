import poov.Automovel;

public class App {
    public static void main(String[] args) throws Exception {
        
        Automovel a1 = new Automovel();
        System.out.println(a1);
        System.out.println(a1.getPreco());

        Automovel a2 = new Automovel("azul", "Fiat 147", "gas");
        System.out.println(a2);
        System.out.println(a2.getPreco());

        if (a1.equals(a2)) {
            System.out.println("Iguais");
        } else {
            System.out.println("DIferentes");
        }

        Automovel a3 = new Automovel("azul", "Fiat 147", "gas");
        if (a2.equals(a3)) {
            System.out.println("Iguais");
        } else {
            System.out.println("DIferentes");
        }

    }
}
