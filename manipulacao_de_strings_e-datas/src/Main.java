import java.time.LocalDate;
import java.time.LocalTime;


public class Main {
    public static void main(String[] args) {

        String palavra1 = "HELLO WORLD";
        String palavra2 = " LINDO DIA";

        //concatenar strings

  String concatenar = palavra1 + palavra2;
  System.out.println(concatenar);

  //comprimento do string

        System.out.println(palavra1.length());

  // converter pra maiusculo ou minusculo

        System.out.println(palavra1.toLowerCase());

  // datas e horas
LocalDate data = LocalDate.now();
LocalTime horas = LocalTime.now();
System.out.println(data);
System.out.println(horas);




int hora = LocalTime.now().getHour();
int minutos = LocalTime.now().getMinute();





System.out.println(palavra1+" AGORA SÃO EXATAMENTE:"+hora+":"+minutos+ " DO DIA\n"+ data);





    }


}

