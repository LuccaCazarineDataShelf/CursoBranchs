public class Livro implements Publicacao{
    private String titulo, autor;
    private int totPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public void abrir(){
        this.setAberto(true);
    }
    public void fechar(){
        this.setAberto(false);
    }
    public void folear(int p){
        if(this.aberto == true){
            this.pagAtual = p;
            if(p > totPag){
                this.pagAtual = 0;
            }
        }
    }
    public void avancarPag(){
        if(this.pagAtual < this.totPag) {
            this.pagAtual++;
        }else{
            this.pagAtual = totPag;
        }
    }
    public void voltarPag(){
       if(this.pagAtual > 0){
           this.pagAtual--;
       }else {
           this.pagAtual = 0;
       }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public Livro(String titulo, String autor, int totPag, Pessoa leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totPag = totPag;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    public String detalhes(){
        return "livro{ " + ", \n título: " + titulo + ", \n  autor: " + autor +
                ", \n total de paginas: " + totPag + ", \n pagina atual: " + pagAtual +
                ", \n aberto: " + aberto + ", \n leitor: " + leitor + '}';

    }
}
