public class Bolsista  extends Aluno{
    private int bolsa;

    public final void renovarBolsa(){
        System.out.println("Renovando bolsa do aluno: " + this.getNome());
    }

    public void pagarMensalidade(){
    }

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
}
