public class App2 {
    public static void main(String args[]){
        Reptil r1 = new Reptil();
        Mamifero m1 = new Mamifero();
        Peixe p1 = new Peixe();
        Ave a1 = new Ave();

        m1.setPeso(51.5f);
        m1.setIdade(35);
        m1.setCorPelo("Branco");
        m1.setMembros(4);
        m1.alimentar();
        m1.emitirSom();
        System.out.printf("Cor do pelo é " + m1.getCorPelo());
    }

}
