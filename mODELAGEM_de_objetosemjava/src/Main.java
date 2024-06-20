//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CACHORRO cachorro1 = new CACHORRO();
        CACHORRO cachorro2 = new CACHORRO();

        cachorro1.nome = "rodolfo";cachorro1.cor = "marrom";cachorro1.idade=12;
        cachorro2.nome = "pepe";cachorro2.cor = "marrom";cachorro2.idade=12;


        System.out.println(cachorro1.name_dog());
        System.out.println(cachorro2.name_dog());






    }
}