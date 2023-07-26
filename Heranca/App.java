public class App {
    public static void main(String args[]){
        Pessoa2 p1 = new Pessoa2();
        Aluno a1 = new Aluno();
        Professor pr1 = new Professor();
        Funcionario f1 = new Funcionario();

        p1.setNome("zé");
        a1.setNome("jao");
        pr1.setNome("maroc");
        f1.setNome("pao");

        System.out.println(p1.toString());
        System.out.println(a1.toString());
        System.out.println(pr1.toString());
        System.out.println(f1.toString());

        p1.setSexo("M");
        System.out.println("sexo pessoa : "+ p1.getSexo());
        a1.setSexo("F");
        System.out.println("sexo Aluno: " + a1.getSexo());
        a1.setCurso("Computacao");
        System.out.println(a1.getCurso());

        pr1.setEspecialidade("matar");
        System.out.println(pr1.getEspecialidade());

        f1.setTrabalhando(true);
        System.out.println(f1.getTrabalhando());


    }

}
