import java.sql.SQLOutput;

public class Peixe extends Animal {
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("algas");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de peixe");
    }
    public void soltarBolhas(){
        System.out.println("soltando bolha");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
