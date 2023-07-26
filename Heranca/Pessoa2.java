public class Pessoa2 {
    private String nome, sexo;
    private int idade;

    public void fazerAniver(){
    this.idade++;
    }
    public String toString() {
        return "Pessoa " + getNome();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSexo(){
        return this.sexo;
    }
    public void setSexo(String s){
        this.sexo = s;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int i){
        this.idade = i;
    }
}
