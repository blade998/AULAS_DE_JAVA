package animal;

public class cachorro {

   public String nome;
   public String cor;
   public int altura;
   public String estadodeespirito;


   public void latir(){
      System.out.println("AU AU PAI PAI");
   }

   public String pegar(){
      return "BOLINHA";
   }

   public  String interagir(String acao){
      if (acao == "carinho"){
        return this.estadodeespirito = "feliz";
      }
      else if(acao == "gritar"){
         return this.estadodeespirito = "triste";
      }
       return acao;
   }




}
