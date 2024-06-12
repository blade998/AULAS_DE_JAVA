
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("DIGITE O PRIMEIRO NUMERO");
        float n1 = scanner.nextFloat();

        System.out.println("DIGITE O SEGUNDO NUMERO");
        float n2 = scanner.nextFloat();


        if(n1 > n2){
            System.out.println("O NUMERO 1 E MAIOR QUE O NUMERO 2");
        }
        else if(n1 < n2){
            System.out.println("O NUMERO 2 E MAIOR QUE O NUMERO 1");
        }
        else if(n1 == n2){
            System.out.println("OS VALORES SÃO IGUAIS");
        }


         String nomeDoMes;
        int mes = 14;


        switch (mes) {
            case 1:
                nomeDoMes = "Janeiro";
                break;
            case 2:
                nomeDoMes = "Fevereiro";
                break;
            case 3:
                nomeDoMes = "Março";
                break;
            case 4:
                nomeDoMes = "Abril";
                break;
            case 5:
                nomeDoMes = "Maio";
                break;
            case 6:
                nomeDoMes = "Junho";
                break;
            case 7:
                nomeDoMes = "Julho";
                break;
            case 8:
                nomeDoMes = "Agosto";
                break;
            case 9:
                nomeDoMes = "Setembro";
                break;
            case 10:
                nomeDoMes = "Outubro";
                break;
            case 11:
                nomeDoMes = "Novembro";
                break;
            case 12:
                nomeDoMes = "Dezembro";
                break;
            default:
                nomeDoMes = "Mês inválido";
                break;
        }

        System.out.println("O mês selecionado é " + nomeDoMes);





    }


}