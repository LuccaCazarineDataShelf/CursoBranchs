public class Cachorro2 extends Lobo{
    public void emitirSom(){
        System.out.println("Latido");
    }
    public void reagir(String frase){
        if(frase == "toma comida" || frase ==  "ola"){
            System.out.println("abanar e latir");
        }else{
            System.out.println("rosnar");
        }
    }
    public void reagir(boolean dono){
        if(dono == true){
            System.out.println("abanar e latir");
        }else{
            System.out.println("rosnar");
        }
    }
    public void reagir(int hora, int min){
        if(hora < 12){
            System.out.println("abanar");
        }else if(hora >= 18){
            System.out.println("ignorar");
        }else{
            System.out.println("abanar e laatir");
        }
    }
    public void reagir(int idade, float peso){
        if(idade <= 5 && peso <= 10){
            System.out.println("novo e animado");
        }else if(idade >= 5 && peso >= 10){
            System.out.println("velho e gordo");
        }else{
            System.out.println("fora dos padroes");
        }
    }
}
