public class Mamifero2 extends Animal2 {
    protected String corPelo;

    public void emitirSom(){
        System.out.println("som de mamifero");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
