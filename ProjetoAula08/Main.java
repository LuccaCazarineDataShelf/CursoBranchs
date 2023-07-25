public class Main {
    public static void main(String args[]){
        Pessoa[] p = new Pessoa[2];
        Livro l[] = new Livro[3];

        p[0] = new Pessoa("pedro", "Masculino", 16);
        p[1] = new Pessoa("Túlio", "Masculino", 32);

        l[0] = new Livro("livro0", "thomas", 20, p [0]);
        l[1] = new Livro("livro1", "carlos", 400, p[1]);
        l[2] = new Livro("livro2", "zé", 200, p[0]);

        l[1].abrir();
        l[1].folear(1);
        l[1].voltarPag();

        System.out.println(l[1].detalhes());
    }
}
