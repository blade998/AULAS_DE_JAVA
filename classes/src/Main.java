//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import animal.cachorro;
public class Main {
    public static void main(String[] args) {


       cachorro cachorro1 = new cachorro();

cachorro1.nome = "pimba";
cachorro1.cor = "Marrom";
cachorro1.altura = 23;

System.out.println(cachorro1.altura);
System.out.println(cachorro1.cor);
System.out.println(cachorro1.nome);

cachorro1.latir();
cachorro1.pegar();
String brinquedo_do_cachorro = cachorro1.pegar();

System.out.println("O CACHORRO PEGOU UMA "+brinquedo_do_cachorro);

System.out.println(cachorro1.interagir("gritar"));
System.out.println(cachorro1.estadodeespirito);

        System.out.println(cachorro1.interagir("carinho"));
        System.out.println(cachorro1.estadodeespirito);



    }
}