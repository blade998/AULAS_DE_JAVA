//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


String nome = "vitinho";

saudacao("VITOR");
saudacao(nome);

System.out.println("DIGITE O PRIMEIRO VALOR PARA SOMAR");

float n1 = scanner.nextFloat();

System.out.println("DIGITE O PRIMEIRO VALOR PARA SOMAR");

float n2 = scanner.nextFloat();

somar(n1,n2);


float resultado_da_funcao_multiplicar = multiplicar(n1,n2);


System.out.println("O VALOR DE RETORNO DA FUNÇÃO MULTIPLICAR FOI:"+resultado_da_funcao_multiplicar);








    }


  public static void saudacao(String nomePRAUSAR){
        System.out.println("HELLO "+ nomePRAUSAR);
  }
  public static void somar(float n1,float n2){
        float result = n1 + n2;
        System.out.println("O RESULTADO DA SOMA DOS DOIS NUMEROS FOI: "+result);
  }

    public static float multiplicar(float n1, float n2){
       return n1 * n2;
    }
}