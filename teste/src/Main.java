//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;


 class Main {
    public static void main(String[] args) {
        System.out.print("HELLO WORLD\n");

        Scanner scanner = new Scanner(System.in);
        LocalDate date =  LocalDate.now();



        System.out.println("DIGITE ALGO PRA O PROGRAMA RODAR "+date);
        var number = scanner.next();


        switch(number){
            case  "1":
                System.out.println("BILADA");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + number);
        }



        double peso = 56.5223;
        System.out.println(peso);
        System.out.println(peso ++);
        System.out.println(peso -= 20.5223);


        var car = "honda";
        System.out.println(car);
        //  não pode ser modificado var car = "towota";



        byte x = 5;
        byte y = 5;
        System.out.println(x <= y);
        System.out.println(x >= y);
        System.out.println(x < y);
        System.out.println(x > y);
        System.out.println(x == y);
        System.out.println(x != y);

        if (x < 6 && y > 4){
            System.out.println("Operadodres logicos");
        }


        if (x > 6 || y > 6){
            System.out.println("Operadodres logicos"); // vai dar falso por que ele tem que ter pelo menos um verdadeiro
        }




        PRODUTO vassoura = new PRODUTO();
        vassoura.PRODUTO("vassoura",353563,56.6f);

        feijao Feijao = new feijao();






        System.out.printf(vassoura.Name+"\n"+vassoura.id_product+"\n"+ vassoura.valor+"\n");


       Feijao.PRODUTO("feijao",64453,23.6f);

        System.out.println(Feijao.id_product);
        System.out.print(Feijao.name_product);
        System.out.print(Feijao.toString());


    }
}