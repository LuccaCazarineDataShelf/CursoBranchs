public class Pessoa{
        private String nome;
        private String sexo;
        private int idade;

        public String getNome(){
            return this.getNome();
        }
        public void setNome(String n){
            this.nome = n;
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

        public void fazerAniversario(){
            this.idade = this.idade + 1;
        }

    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }
}
