

import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);




float n1;

for(n1= 1;n1 <= 21;n1++){
    System.out.println(n1);
}

n1 = 0;
while(n1 <= 20){
    System.out.println(n1);
    n1+=2;
}



System.out.println("ESCREVA O NUMERO QUE VC DESEJA VER A TABUADA");
int number = scanner.nextInt();


for(int tabuada=1;tabuada <= 10;tabuada++ ){
    int resultado = number * tabuada;

    System.out.println(number+"X"+tabuada+"="+resultado);
}


    }
}