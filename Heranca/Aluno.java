public class Aluno extends Pessoa2{
    private int matricula;
    private String curso;

    // métodos

    public void cancelarMatricula(){
        System.out.println("Matricula cancelada!");
    }

    public String toString() {
        return "Aluno: " + getNome();
    }

    //getters and setters


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
