public class Professor extends Pessoa2{
    private String especialidade;
    private float salario;

    // Métodos

    public void receberAumento(float aum){
        this.salario = this.salario + aum;
    }
    public String toString() {
        return "Professor: " + getNome();
    }

    // setters and getters


    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
