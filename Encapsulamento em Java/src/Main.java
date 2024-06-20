import conta.Conta_Bancaria;

import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Conta_Bancaria contaVitor = new Conta_Bancaria();

        contaVitor.nome = "Vitor";
        contaVitor.cpf = 3443353553L;

        System.out.println(contaVitor.nome);
        System.out.println(contaVitor.cpf);
        System.out.println(contaVitor.Saldo());


        System.out.println("ESCREVAO DINHEIRO QUE DESEJAR ACRESCENTAR A SUA CONTA");
        long  value = scanner.nextLong();

        contaVitor.adicionar_dinheiro(value);

        System.out.println(contaVitor.getSaldo());




    }
}