public class Estudante extends Pessoa {
    private String curso;

    public Estudante(String nome, int idade, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    public void mostrarCurso() {
        System.out.println("Eu curso " + curso);
    }
}
