public class Funcionario extends Pessoa2{
    private String setor;
    private boolean trabalhando;

    public void mudarTrabalho(){
        this.trabalhando =! this.trabalhando;
    }
    public String toString() {
        return "Funcionario: " + getNome();
    }


    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }


}
