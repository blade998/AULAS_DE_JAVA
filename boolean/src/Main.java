//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean sol = true;
        boolean chuva = false;


        if(sol == true){
            System.out.println("esta fazendo sol");
        }
        else if(chuva == true){
            System.out.println("Não está fazendo sol esta chovendoooo");
        }

        boolean AND = sol && chuva;
        System.out.println(AND);

        boolean OU = sol || chuva;
        System.out.println(OU);



    }
}